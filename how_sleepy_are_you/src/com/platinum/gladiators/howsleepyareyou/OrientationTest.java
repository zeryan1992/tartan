// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

// Referenced classes of package com.platinum.gladiators.howsleepyareyou:
//            Storage, QuestionAlert

public class OrientationTest extends Activity
    implements SensorEventListener
{

    private static int DELAY_SENSOR = 0x7a120;
    Sensor sensor;
    SensorManager sensorManager;
    int theResult;
    int xRotation;
    int zRotation;

    public OrientationTest()
    {
        xRotation = 0;
        zRotation = 0;
        theResult = 0;
    }

    private String timeFormating(int i)
    {
        int j = i / 100;
        return String.format("%02d:%02d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i - j * 100)
        });
    }

    private void updater(float af[])
    {
        float af1[] = new float[9];
        SensorManager.getRotationMatrixFromVector(af1, af);
        af = new float[9];
        SensorManager.remapCoordinateSystem(af1, 1, 2, af);
        af1 = new float[3];
        SensorManager.getOrientation(af, af1);
        xRotation = (int)Math.toDegrees(af1[1]);
        zRotation = (int)Math.toDegrees(af1[2]);
        ((TextView)findViewById(0x7f080044)).setText((new StringBuilder()).append("").append(zRotation).toString());
    }

    public void onAccuracyChanged(Sensor sensor1, int i)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        bundle = new Storage(getApplicationContext());
        TextView textview;
        try
        {
            sensorManager = (SensorManager)getSystemService("sensor");
            sensor = sensorManager.getDefaultSensor(11);
            sensorManager.registerListener(this, sensor, DELAY_SENSOR);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        textview = (TextView)findViewById(0x7f080045);
        if (zRotation >= 30 && xRotation < 50)
        {
            theResult = theResult + 100;
        } else
        {
            theResult = 20;
        }
        (new CountDownTimer(textview, bundle) {

            final OrientationTest this$0;
            final Storage val$storage;
            final TextView val$timer;

            public void onFinish()
            {
                Intent intent = new Intent(OrientationTest.this, com/platinum/gladiators/howsleepyareyou/QuestionAlert);
                storage.storeSessionId("ori_res", theResult);
                startActivity(intent);
            }

            public void onTick(long l)
            {
                int i = (int)l;
                timer.setText(timeFormating(i / 10));
            }

            
            {
                this$0 = OrientationTest.this;
                timer = textview;
                storage = storage1;
                super(final_l, final_l1);
            }
        }).start();
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
label0:
        {
            if (sensorevent.sensor == sensor)
            {
                if (sensorevent.values.length <= 4)
                {
                    break label0;
                }
                float af[] = new float[9];
                System.arraycopy(sensorevent.values, 0, af, 0, 4);
                updater(af);
            }
            return;
        }
        updater(sensorevent.values);
    }


}
