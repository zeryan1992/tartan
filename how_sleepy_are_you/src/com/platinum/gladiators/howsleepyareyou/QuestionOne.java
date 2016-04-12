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
//            Storage, QuestionTwo

public class QuestionOne extends Activity
{

    Button buttonOne;
    Button buttonTwo;
    int firstQuestionResult;

    public QuestionOne()
    {
    }

    protected void onCreate(final Bundle storage)
    {
        super.onCreate(storage);
        setContentView(0x7f03001e);
        buttonOne = (Button)findViewById(0x7f08004c);
        storage = new Storage(getApplicationContext());
        buttonOne.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionOne this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                firstQuestionResult = firstQuestionResult + 0;
                view = new Intent(QuestionOne.this, com/platinum/gladiators/howsleepyareyou/QuestionTwo);
                storage.storeSessionId("q_one", firstQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionOne.this;
                storage = storage1;
                super();
            }
        });
        buttonTwo = (Button)findViewById(0x7f08004d);
        buttonTwo.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionOne this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                firstQuestionResult = firstQuestionResult + 100;
                view = new Intent(QuestionOne.this, com/platinum/gladiators/howsleepyareyou/QuestionTwo);
                storage.storeSessionId("q_one", firstQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionOne.this;
                storage = storage1;
                super();
            }
        });
    }
}
