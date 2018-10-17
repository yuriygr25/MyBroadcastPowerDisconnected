package com.example.yura.mybroadcastpowerdisconnected;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {
    public MessageReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            String message = "Обнаружено сообщение "
                    + intent.getAction();


            Toast.makeText(context, message,
                    Toast.LENGTH_LONG)
                    .show();
        }


    }
}
