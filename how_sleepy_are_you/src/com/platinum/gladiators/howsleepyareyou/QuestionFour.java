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
//            Storage, QuestionFive

public class QuestionFour extends Activity
{

    private Button buttonOne;
    private Button buttonTwo;
    private int fourQuestionResult;

    public QuestionFour()
    {
    }

    protected void onCreate(final Bundle storage)
    {
        super.onCreate(storage);
        setContentView(0x7f03001d);
        buttonOne = (Button)findViewById(0x7f080049);
        storage = new Storage(getApplicationContext());
        buttonOne.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionFour this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                fourQuestionResult = fourQuestionResult + 0;
                view = new Intent(QuestionFour.this, com/platinum/gladiators/howsleepyareyou/QuestionFive);
                storage.storeSessionId("q_four", fourQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionFour.this;
                storage = storage1;
                super();
            }
        });
        buttonTwo = (Button)findViewById(0x7f08004a);
        buttonTwo.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionFour this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                fourQuestionResult = fourQuestionResult + 100;
                view = new Intent(QuestionFour.this, com/platinum/gladiators/howsleepyareyou/QuestionFive);
                storage.storeSessionId("q_four", fourQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionFour.this;
                storage = storage1;
                super();
            }
        });
    }



/*
    static int access$002(QuestionFour questionfour, int i)
    {
        questionfour.fourQuestionResult = i;
        return i;
    }

*/
}
