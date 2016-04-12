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
//            Storage, Results

public class QuestionSeven extends Activity
{

    private Button buttonOne;
    private Button buttonTwo;
    private int sevenQuestionResult;

    public QuestionSeven()
    {
    }

    protected void onCreate(final Bundle storage)
    {
        super.onCreate(storage);
        setContentView(0x7f03001f);
        buttonOne = (Button)findViewById(0x7f08004e);
        storage = new Storage(getApplicationContext());
        buttonOne.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionSeven this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                sevenQuestionResult = sevenQuestionResult + 0;
                view = new Intent(QuestionSeven.this, com/platinum/gladiators/howsleepyareyou/Results);
                storage.storeSessionId("q_seven", sevenQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionSeven.this;
                storage = storage1;
                super();
            }
        });
        buttonTwo = (Button)findViewById(0x7f08004f);
        buttonTwo.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionSeven this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                sevenQuestionResult = sevenQuestionResult + 100;
                view = new Intent(QuestionSeven.this, com/platinum/gladiators/howsleepyareyou/Results);
                storage.storeSessionId("q_seven", sevenQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionSeven.this;
                storage = storage1;
                super();
            }
        });
    }



/*
    static int access$002(QuestionSeven questionseven, int i)
    {
        questionseven.sevenQuestionResult = i;
        return i;
    }

*/
}
