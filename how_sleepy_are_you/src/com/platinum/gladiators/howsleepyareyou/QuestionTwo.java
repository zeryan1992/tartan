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
//            Storage, QuestionThree

public class QuestionTwo extends Activity
{

    Button buttonOne;
    Button buttonTwo;
    int secondQuestionResult;

    public QuestionTwo()
    {
    }

    protected void onCreate(final Bundle storage)
    {
        super.onCreate(storage);
        setContentView(0x7f030022);
        buttonOne = (Button)findViewById(0x7f080054);
        storage = new Storage(getApplicationContext());
        buttonOne.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionTwo this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                secondQuestionResult = secondQuestionResult + 0;
                view = new Intent(QuestionTwo.this, com/platinum/gladiators/howsleepyareyou/QuestionThree);
                storage.storeSessionId("q_two", secondQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionTwo.this;
                storage = storage1;
                super();
            }
        });
        buttonTwo = (Button)findViewById(0x7f080055);
        buttonTwo.setOnClickListener(new android.view.View.OnClickListener() {

            final QuestionTwo this$0;
            final Storage val$storage;

            public void onClick(View view)
            {
                secondQuestionResult = secondQuestionResult + 100;
                view = new Intent(QuestionTwo.this, com/platinum/gladiators/howsleepyareyou/QuestionThree);
                storage.storeSessionId("q_two", secondQuestionResult);
                startActivity(view);
            }

            
            {
                this$0 = QuestionTwo.this;
                storage = storage1;
                super();
            }
        });
    }
}
