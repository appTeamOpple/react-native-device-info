package com.learnium.RNDeviceInfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/**
 * @author:OP078081
 * @eamil:jiangbo.mi@opple.com
 * @description: todo
 * @date: 2024/9/4
 **/
public class CompatReceviceHelp {
    public static Intent compatRegisterReceiver(
            Context context, BroadcastReceiver receiver, IntentFilter filter, boolean exported) {
        if (Build.VERSION.SDK_INT >= 34 && context.getApplicationInfo().targetSdkVersion >= 34) {
            return context.registerReceiver(
                    receiver, filter, exported ? Context.RECEIVER_EXPORTED : Context.RECEIVER_NOT_EXPORTED);
        } else {
            return context.registerReceiver(receiver, filter);
        }
    }
}
