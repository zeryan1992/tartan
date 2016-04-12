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
import android.widget.EditText;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            Storage, Age_Detector, OrientationTest

public class AgeDetection extends Activity
{

    EditText age;
    EditText gender;
    EditText hoursSleep;
    Button start;

    public AgeDetection()
    {
    }

    protected void onCreate(final Bundle editor)
    {
        super.onCreate(editor);
        setContentView(0x7f030019);
        editor = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
        age = (EditText)findViewById(0x7f080040);
        hoursSleep = (EditText)findViewById(0x7f08003f);
        gender = (EditText)findViewById(0x7f080041);
        start = (Button)findViewById(0x7f080042);
        final Storage storage = new Storage(getApplicationContext());
        start.setOnClickListener(new android.view.View.OnClickListener() {

            final AgeDetection this$0;
            final android.content.SharedPreferences.Editor val$editor;
            final Storage val$storage;

            public void onClick(View view)
            {
                int i = Integer.parseInt(age.getText().toString());
                int j = Integer.parseInt(hoursSleep.getText().toString());
                view = gender.getText().toString();
                new Age_Detector();
                i = Age_Detector.howSleepyAreYou(i, view, j);
                view = new Intent(AgeDetection.this, com/platinum/gladiators/howsleepyareyou/OrientationTest);
                storage.storeSessionId("score_age", i);
                editor.commit();
                startActivity(view);
            }

            
            {
                this$0 = AgeDetection.this;
                storage = storage1;
                editor = editor1;
                super();
            }
        });
    }
}
