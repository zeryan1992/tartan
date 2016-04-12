// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.platinum.gladiators.howsleepyareyou;

import java.io.PrintStream;

public class Age_Detector
{

    public Age_Detector()
    {
    }

    public static int howSleepyAreYou(int i, String s, int j)
    {
        double d;
        j = 24 - j;
        if (j < 0)
        {
            return 0;
        }
        if (i < 0)
        {
            return 0;
        }
        if (i < 2)
        {
            i = testRange(new int[] {
                11, 13, 14, 17, 18, 19
            }, j);
        } else
        if (i < 5)
        {
            i = testRange(new int[] {
                9, 10, 11, 14, 15, 16
            }, j);
        } else
        if (i < 13)
        {
            i = testRange(new int[] {
                8, 9, 10, 13, 14, 14
            }, j);
        } else
        if (i < 17)
        {
            i = testRange(new int[] {
                7, 7, 8, 10, 11, 11
            }, j);
        } else
        if (i < 25)
        {
            i = testRange(new int[] {
                6, 6, 7, 9, 10, 11
            }, j);
        } else
        if (i < 64)
        {
            i = testRange(new int[] {
                6, 6, 7, 9, 10, 10
            }, j);
        } else
        {
            i = testRange(new int[] {
                5, 6, 7, 8, 9, 9
            }, j);
        }
        d = 0.0D;
        if (!s.equals("male")) goto _L2; else goto _L1
_L1:
        d = 3.3999999999999999D;
_L4:
        d = (Math.log(i) / Math.log(2D)) * 10D * d;
        System.out.println(d);
        System.out.println(392.72539799999998D);
        return (int)d;
_L2:
        if (s.equals("female"))
        {
            d = 1.3999999999999999D;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int testRange(int ai[], int i)
    {
        if (i < ai[0])
        {
            return 1000;
        }
        if (i < ai[1])
        {
            return 2000;
        }
        if (i < ai[3])
        {
            return 3000;
        }
        return i >= ai[5] ? 5000 : 4000;
    }
}
