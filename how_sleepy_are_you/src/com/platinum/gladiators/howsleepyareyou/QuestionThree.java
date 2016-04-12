// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            Storage, TimerGame

public class QuestionThree extends Activity
{

    private Button buttonOne;
    private Button buttonTwo;
    private int thirdQuestionResult;

    public QuestionThree()
    {
    }

    protected void onCreate(final Bundle storage)
    {
        super.onCreate(storage);
        setContentView(0x7f030021);
        storage = new Storage(getApplicationContext());
        buttonOne = (Button)findViewById(0x7f080052);
        buttonOne.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionThree this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                thirdQuestionResult = thirdQuestionResult + 0;
                view = new Intent(QuestionThree.this, com/platinum/gladiators/howsleepyareyou/TimerGame);
                storage.storeSessionId("q_three", thirdQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionThree.this;
                storage = storage1;
                super();
            }
        });
        buttonTwo = (Button)findViewById(0x7f080053);
        buttonTwo.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionThree this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                thirdQuestionResult = thirdQuestionResult + 100;
                view = new Intent(QuestionThree.this, com/platinum/gladiators/howsleepyareyou/TimerGame);
                storage.storeSessionId("q_three", thirdQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionThree.this;
                storage = storage1;
                super();
            }
        });
    }



/*
    static int access$002(QuestionThree questionthree, int i)
    {
        questionthree.thirdQuestionResult = i;
        return i;
    }

*/
}
