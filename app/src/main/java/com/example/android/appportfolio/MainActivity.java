package com.example.android.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


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

    public void scores_app(View view) {
        String string = getString(R.string.App2);
        displayToast(string);
    }

    public void spotify_streamer(View view) {
        String string = getString(R.string.App1);
        displayToast(string);
    }

    public void library_app(View view) {
        String string = getString(R.string.App3);
        displayToast(string);
    }

    public void build_it_bigger(View view) {
        String string = getString(R.string.App4);
        displayToast(string);
    }

    public void xyz_reader(View view) {
        String string = getString(R.string.App5);
        displayToast(string);
    }

    public void capstone(View view) {
        String string = getString(R.string.App6);
        displayToast(string);
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


    private void displayToast(String appName) {
        Context context = getApplicationContext();
        String msg = "This button will launch \n" + appName;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();

    }

}
