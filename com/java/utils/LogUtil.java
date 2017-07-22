package com.java.utils;

import android.util.Log;

/**
 * Created by baiyf on 17-7-13.
 */

public class LogUtil {

    private static final String TAG = "LogUtil";

    private static final boolean __reinforce_debug = true;

    public static void d(String str) {
        if (__reinforce_debug) {
            Log.d(TAG, getLogString(str));
        }
    }

    private static String getLogString(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return new StringBuilder(">>Class: ").append(stackTraceElement.getClassName())
                .append(" >>Method: ").append(stackTraceElement.getMethodName())
                .append(" >> ").append(str).append("\n").toString();
    }

}
