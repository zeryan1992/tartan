// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            QuestionSeven

public class QuestionSix extends Activity
{

    private Button buttonOne;
    private Button buttonTwo;
    private int sixQuestionResult;

    public QuestionSix()
    {
    }

    protected void onCreate(final Bundle editor)
    {
        super.onCreate(editor);
        setContentView(0x7f030020);
        buttonOne = (Button)findViewById(0x7f080050);
        editor = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
        buttonOne.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionSix this$0;
            final android.content.SharedPreferences.Editor val$editor;

            public void onClick(View view)
            {
                sixQuestionResult = sixQuestionResult + 0;
                view = new Intent(QuestionSix.this, com/platinum/gladiators/howsleepyareyou/QuestionSeven);
                editor.putInt("q_six", sixQuestionResult);
                editor.commit();
                startActivity(view);
            }

            
            {
                this$0 = QuestionSix.this;
                editor = editor1;
                super();
            }
        });
        buttonTwo = (Button)findViewById(0x7f080051);
        buttonTwo.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionSix this$0;
            final android.content.SharedPreferences.Editor val$editor;

            public void onClick(View view)
            {
                sixQuestionResult = sixQuestionResult + 100;
                view = new Intent(QuestionSix.this, com/platinum/gladiators/howsleepyareyou/QuestionSeven);
                editor.putInt("q_six", sixQuestionResult);
                editor.commit();
                startActivity(view);
            }

            
            {
                this$0 = QuestionSix.this;
                editor = editor1;
                super();
            }
        });
    }



/*
    static int access$002(QuestionSix questionsix, int i)
    {
        questionsix.sixQuestionResult = i;
        return i;
    }

*/
}
