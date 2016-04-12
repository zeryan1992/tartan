// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import android.content.Context;
import android.content.SharedPreferences;

public class Storage
{

    public static int KEY_MODE_PRIVATE = 0;
    public static String KEY_SHARED_PREF;
    public static int SESSION_ID;
    public static Context context;
    public static SharedPreferences preferences;

    public Storage(Context context1)
    {
        context = context1;
        preferences = context.getSharedPreferences(KEY_SHARED_PREF, KEY_MODE_PRIVATE);
    }

    public int getSessionId(String s)
    {
        return preferences.getInt(s, 0);
    }

    public void storeSessionId(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(s, i);
        editor.commit();
    }

}
