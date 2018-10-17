package com.example.yura.mybroadcastpowerdisconnected;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MessageReceiver mMessageReceiver = new MessageReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerBroadcastReceiver(View view) {
        this.registerReceiver(mMessageReceiver, new IntentFilter(
                "android.intent.action.ACTION_POWER_DISCONNECTED"));
        Toast.makeText(getApplicationContext(), "Приёмник включен",
                Toast.LENGTH_SHORT).show();
    }


    public void unregisterBroadcastReceiver(View view) {
        this.unregisterReceiver(mMessageReceiver);

        Toast.makeText(getApplicationContext(), "Приёмник выключён", Toast.LENGTH_SHORT)
                .show();
    }

}
