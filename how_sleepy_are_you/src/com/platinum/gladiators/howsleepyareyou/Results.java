// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            Storage

public class Results extends Activity
{

    public Results()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030023);
        bundle = new Storage(getApplicationContext());
        int i = bundle.getSessionId("q_one");
        int j = bundle.getSessionId("q_two");
        int k = bundle.getSessionId("q_three");
        int l = bundle.getSessionId("q_four");
        i = i + k + bundle.getSessionId("q_five") + l + j + bundle.getSessionId("q_six") + bundle.getSessionId("q_seven") + bundle.getSessionId("timer_score") + bundle.getSessionId("score_age") + bundle.getSessionId("ori_res");
        bundle = (TextView)findViewById(0x7f080056);
        TextView textview = (TextView)findViewById(0x7f080057);
        bundle.setText((new StringBuilder()).append("").append(i).toString());
        if (i < 800)
        {
            textview.setText("Go home you are sleepy");
        } else
        if (i >= 800)
        {
            textview.setText("Champion, You are full of energy");
            return;
        }
    }
}
