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
//            Storage, QuestionSix

public class QuestionFive extends Activity
{

    private Button buttonOne;
    private Button buttonTwo;
    private int fiveQuestionResult;

    public QuestionFive()
    {
    }

    protected void onCreate(final Bundle storage)
    {
        super.onCreate(storage);
        setContentView(0x7f03001c);
        buttonOne = (Button)findViewById(0x7f080047);
        storage = new Storage(getApplicationContext());
        buttonOne.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionFive this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                fiveQuestionResult = fiveQuestionResult + 0;
                view = new Intent(QuestionFive.this, com/platinum/gladiators/howsleepyareyou/QuestionSix);
                storage.storeSessionId("q_five", fiveQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionFive.this;
                storage = storage1;
                super();
            }
        });
        buttonTwo = (Button)findViewById(0x7f080048);
        buttonTwo.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionFive this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                fiveQuestionResult = fiveQuestionResult + 100;
                view = new Intent(QuestionFive.this, com/platinum/gladiators/howsleepyareyou/QuestionSix);
                storage.storeSessionId("q_five", fiveQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionFive.this;
                storage = storage1;
                super();
            }
        });
    }



/*
    static int access$002(QuestionFive questionfive, int i)
    {
        questionfive.fiveQuestionResult = i;
        return i;
    }

*/
}
