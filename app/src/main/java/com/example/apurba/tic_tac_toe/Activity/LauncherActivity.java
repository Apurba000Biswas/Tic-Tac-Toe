package com.example.apurba.tic_tac_toe.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.apurba.tic_tac_toe.Helper.CustomStyle;
import com.example.apurba.tic_tac_toe.R;

public class LauncherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        CustomStyle.setCustomAppBar(this, getSupportActionBar());

    }

}
