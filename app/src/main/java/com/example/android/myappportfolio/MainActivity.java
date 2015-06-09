package com.example.android.myappportfolio;

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

    public void clickButton(View v)
    {
        if(v.getId() == R.id.spotify_streamer||v.getId() == R.id.scores_apps||v.getId() == R.id.library_app||
                v.getId() == R.id.build_it_bigger|| v.getId() == R.id.bacon_reader||v.getId() == R.id.my_own_app)
        {
            MessageBox("This button will launch my capstone app");
        }
    }

    public void MessageBox(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
