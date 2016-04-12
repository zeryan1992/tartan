// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            QuestionOne

public class QuestionAlert extends Activity
{

    public QuestionAlert()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030018);
        (new Handler()).postDelayed(new Runnable() {

            final QuestionAlert this$0;

            public void run()
            {
                Intent intent = new Intent(QuestionAlert.this, com/platinum/gladiators/howsleepyareyou/QuestionOne);
                startActivity(intent);
            }

            
            {
                this$0 = QuestionAlert.this;
                super();
            }
        }, 3000L);
    }
}
