package com.myappportfolio.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

/**
 * Change Log: (as suggested by Udacity Team)
 * On 07/09/2015
 *
 * 1- Remove onOptionsItemSelected() because there is no use of this in our application
 * 2- Make a member variable of Toast
 * 3- When user clicks on any other button then cancel the previous Toast if exits, and lauch the new one
 */

public class MainActivity extends ActionBarActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void sendMessage(View view) {
        Log.d(LOG_TAG, "sendMessage() method");

        String message = "";

        switch (view.getId()) {
            case R.id.media_streamer:
                message = getString(R.string.message_media_streamer);
                break;
            case R.id.super_duo1:
                message = getString(R.string.message_super_duo1);
                break;
            case R.id.super_duo2:
                message = getString(R.string.message_super_duo2);
                break;
            case R.id.ant_terminator:
                message = getString(R.string.message_ant_terminator);
                break;
            case R.id.materialize:
                message = getString(R.string.message_materialize);
                break;
            case R.id.capstone:
                message = getString(R.string.message_capstone);
                break;
            default:
                message = "Not a valid Id for the views!";
                break;
        }

        if (mToast != null) {
            mToast.cancel();
        }

        mToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        mToast.show();
    }
}
