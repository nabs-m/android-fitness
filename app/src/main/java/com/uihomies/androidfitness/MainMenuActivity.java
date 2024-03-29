package com.uihomies.androidfitness;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;


public class MainMenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(R.layout.activity_main_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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

    @Override
    public void onBackPressed(){
        //exit app
    }
    public void menuButtonClick(View view) {
        switch (view.getId()) {
            case R.id.launchButton: {
                Intent intent;
                intent = new Intent(MainMenuActivity.this, SensorConnect.class);
                startActivity(intent);
                break;
            }
            case R.id.profileButton: {
                Intent intent;
                intent = new Intent(MainMenuActivity.this, Profile.class);
                startActivity(intent);
                break;
            }
            case R.id.progressButton: {
                Intent intent;
                intent = new Intent(MainMenuActivity.this, ProgressActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.tutorialButton: {
                Intent intent;
                intent = new Intent(MainMenuActivity.this, Tutorial1.class);
                startActivity(intent);
                break;
            }
            case R.id.settingsButton: {
                Intent intent;
                intent = new Intent(MainMenuActivity.this, SettingsActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
