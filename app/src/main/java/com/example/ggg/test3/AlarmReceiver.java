package com.example.ggg.test3;

/**
 * Created by GGG on 21/4/2559.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by octoboy on 22/11/2557.
 */
public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent arg1) {
        Intent i = new Intent(context, ShowEvent.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }

}