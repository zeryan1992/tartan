// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            AgeDetection

public class MainActivity extends Activity
{

    private static int timer = 3000;

    public MainActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030017);
        (new Handler()).postDelayed(new Runnable() {

            final MainActivity this$0;

            public void run()
            {
                Intent intent = new Intent(MainActivity.this, com/platinum/gladiators/howsleepyareyou/AgeDetection);
                startActivity(intent);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        }, timer);
    }

}
