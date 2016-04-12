// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            QuestionFour

public class TimerGame extends Activity
{

    CountDownTimer countTimer;
    int curTime;
    boolean hasFinished;
    android.view.View.OnClickListener mStartListener;
    android.view.View.OnClickListener mStopListener;
    int score;
    Button startButton;
    TextView timer;

    public TimerGame()
    {
        countTimer = new CountDownTimer(10000L, 10L) {

            final TimerGame this$0;

            public void onFinish()
            {
                timer.setText("Your Score: 0");
                score = 0;
                hasFinished = true;
            }

            public void onTick(long l)
            {
                curTime = (int)l;
                timer.setText(timeFormatting(curTime / 10));
            }

            
            {
                this$0 = TimerGame.this;
                super(l, l1);
            }
        };
        mStartListener = new android.view.View.OnClickListener() {

            final TimerGame this$0;

            public void onClick(View view)
            {
                startButton.setOnClickListener(mStopListener);
                startButton.setText("End");
                countTimer.start();
            }

            
            {
                this$0 = TimerGame.this;
                super();
            }
        };
        mStopListener = new android.view.View.OnClickListener() {

            final TimerGame this$0;

            public void onClick(View view)
            {
                countTimer.cancel();
                startButton.setText("Next");
                view = getSharedPreferences("data", 0).edit();
                if (curTime / 10 > 100 || hasFinished) goto _L2; else goto _L1
_L1:
                score = 100 - curTime / 10;
                timer.setText((new StringBuilder()).append("Your Score:").append(score).toString());
                Intent intent = new Intent(TimerGame.this, com/platinum/gladiators/howsleepyareyou/QuestionFour);
                view.putInt("timer_score", score);
                view.commit();
                startActivity(intent);
_L4:
                hasFinished = true;
                return;
_L2:
                if (!hasFinished)
                {
                    timer.setText("Your Score: 0");
                    score = 0;
                    Intent intent1 = new Intent(TimerGame.this, com/platinum/gladiators/howsleepyareyou/QuestionFour);
                    view.putInt("timer_score", score);
                    view.commit();
                    startActivity(intent1);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = TimerGame.this;
                super();
            }
        };
    }

    public int getScore()
    {
        return score;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030025);
        score = 0;
        hasFinished = false;
        timer = (TextView)findViewById(0x7f080059);
        timer.setText("10:00");
        ((TextView)findViewById(0x7f080058)).setText("Click start to start. Get as close to 0 as possible but never exceed 0!\n Get score higher than 0 by getting to less than 1 sec");
        startButton = (Button)findViewById(0x7f08005a);
        startButton.setOnClickListener(mStartListener);
    }

    public String timeFormatting(int i)
    {
        int j = i / 100;
        return String.format("%02d:%02d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i - j * 100)
        });
    }
}
