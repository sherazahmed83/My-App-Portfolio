package com.myappportfolio.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
