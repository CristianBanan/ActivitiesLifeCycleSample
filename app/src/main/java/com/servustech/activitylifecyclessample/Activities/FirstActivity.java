package com.servustech.activitylifecyclessample.Activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.servustech.activitylifecyclessample.R;
import com.servustech.activitylifecyclessample.databinding.ActivityFirstBinding;

import java.io.FileReader;

public class FirstActivity extends AppCompatActivity {

    private final String FIRST_ACTIVITY = "FirstActivity";
    private ActivityFirstBinding screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        screen = DataBindingUtil.setContentView(this, R.layout.activity_first);
        setSecondActivityButtonListener();
        Log.d(FIRST_ACTIVITY, "- OnCreated()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(FIRST_ACTIVITY, "- onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(FIRST_ACTIVITY, "- onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(FIRST_ACTIVITY, "- onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(FIRST_ACTIVITY, "- onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(FIRST_ACTIVITY, "- onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(FIRST_ACTIVITY, "- onDestroy()");
    }

    private void setSecondActivityButtonListener(){
        screen.toSecondActivityButton.setOnClickListener(v -> {
            goToSecondIntend();
        });
    }

    private void goToSecondIntend(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
