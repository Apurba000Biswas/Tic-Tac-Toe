package com.example.apurba.tic_tac_toe.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import com.example.apurba.tic_tac_toe.Styles.CustomStyle;
import com.example.apurba.tic_tac_toe.R;

public class LauncherActivity extends AppCompatActivity {

    private TextView mFirstRowFirstTv;
    private TextView mFirstRowSecondTv;
    private TextView mFirstRowThirdTv;
    private TextView mSecondRowFirstTv;
    private TextView mSecondRowSecondTv;
    private TextView mSecondRowThirdTv;
    private TextView mThirdRowFirstTv;
    private TextView mThirdRowSecondTv;
    private TextView mThirdRowThirdTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        CustomStyle.setCustomAppBar(this, getSupportActionBar());

        initializeButtons();
        setAnimation();

    }

    private void initializeButtons(){
        mFirstRowFirstTv = findViewById(R.id.tv_fist_row_1);
        mFirstRowSecondTv = findViewById(R.id.tv_fist_row_2);
        mFirstRowThirdTv = findViewById(R.id.tv_fist_row_3);

        mSecondRowFirstTv = findViewById(R.id.tv_second_row_1);
        mSecondRowSecondTv = findViewById(R.id.tv_second_row_2);
        mSecondRowThirdTv = findViewById(R.id.tv_second_row_3);

        mThirdRowFirstTv = findViewById(R.id.tv_third_row_1);
        mThirdRowSecondTv = findViewById(R.id.tv_third_row_2);
        mThirdRowThirdTv = findViewById(R.id.tv_third_row_3);
    }

    private void setAnimation(){
        CustomStyle.setRightAnimationToTextView(this, mFirstRowFirstTv);
        CustomStyle.setRightAnimationToTextView(this, mFirstRowSecondTv);
        CustomStyle.setRightAnimationToTextView(this, mFirstRowThirdTv);
        CustomStyle.setLeftAnimationToTextView(this, mSecondRowFirstTv);
        CustomStyle.setLeftAnimationToTextView(this, mSecondRowSecondTv);
        CustomStyle.setLeftAnimationToTextView(this, mSecondRowThirdTv);
        CustomStyle.setBotomRightAnimationToTextView(this, mThirdRowFirstTv);
        CustomStyle.setBotomRightAnimationToTextView(this, mThirdRowSecondTv);
        CustomStyle.setBotomRightAnimationToTextView(this, mThirdRowThirdTv);
    }

}
