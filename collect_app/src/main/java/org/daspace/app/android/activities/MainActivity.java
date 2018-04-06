package org.daspace.app.android.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.daspace.app.android.Analysis;
import org.daspace.app.android.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(this,SplashScreenActivity.class);
        startActivity(intent);
    }

    public void onCardClick(View view) {
        Intent intent = new Intent(this,Analysis.class);
        startActivity(intent);
    }
}
