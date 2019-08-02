package com.servustech.activitylifecyclessample.Activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.servustech.activitylifecyclessample.R;
import com.servustech.activitylifecyclessample.databinding.ActivityFirstBinding;
import com.servustech.activitylifecyclessample.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private final String SECOND_ACTIVITY = "SecondActivity";
    private ActivitySecondBinding screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        screen = DataBindingUtil.setContentView(this, R.layout.activity_second);
        setSecondActivityButtonListener();
        Log.d(SECOND_ACTIVITY, "- OnCreated()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(SECOND_ACTIVITY, "- onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(SECOND_ACTIVITY, "- onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(SECOND_ACTIVITY, "- onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(SECOND_ACTIVITY, "- onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(SECOND_ACTIVITY, "- onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(SECOND_ACTIVITY, "- onRestart()");
    }


    private void setSecondActivityButtonListener(){
        screen.toFirstActivityButton.setOnClickListener(v -> {
            goToFirstIntend();
        });
    }

    private void goToFirstIntend(){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
}
