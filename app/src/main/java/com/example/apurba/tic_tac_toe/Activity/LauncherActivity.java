package com.example.apurba.tic_tac_toe.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import com.example.apurba.tic_tac_toe.Play.TicTacToeGamePlay;
import com.example.apurba.tic_tac_toe.Styles.CustomStyle;
import com.example.apurba.tic_tac_toe.R;


public class LauncherActivity extends AppCompatActivity {

    private static TextView mFirstRowFirstTv;
    private static TextView mFirstRowSecondTv;
    private static TextView mFirstRowThirdTv;
    private static TextView mSecondRowFirstTv;
    private static TextView mSecondRowSecondTv;
    private static TextView mSecondRowThirdTv;
    private static TextView mThirdRowFirstTv;
    private static TextView mThirdRowSecondTv;
    private static TextView mThirdRowThirdTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        CustomStyle.setCustomAppBar(this, getSupportActionBar());

        initializeButtons();
        setAnimation();
        //setGamePlayGrid();
        playGame();
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
        CustomStyle.setBottomRightAnimationToTextView(this, mThirdRowFirstTv);
        CustomStyle.setBottomRightAnimationToTextView(this, mThirdRowSecondTv);
        CustomStyle.setBottomRightAnimationToTextView(this, mThirdRowThirdTv);
    }


    private void playGame(){
        TicTacToeGamePlay play = new TicTacToeGamePlay();
        setClickListener(play);
    }

    public void setClickListener(TicTacToeGamePlay play){
        mFirstRowFirstTv.setOnClickListener(play);
        mFirstRowSecondTv.setOnClickListener(play);
        mFirstRowThirdTv.setOnClickListener(play);
        mSecondRowFirstTv.setOnClickListener(play);
        mSecondRowSecondTv.setOnClickListener(play);
        mSecondRowThirdTv.setOnClickListener(play);
        mThirdRowFirstTv.setOnClickListener(play);
        mThirdRowSecondTv.setOnClickListener(play);
        mThirdRowThirdTv.setOnClickListener(play);
    }
    public static void setmFirstRowFirstTv() {
       mFirstRowFirstTv.setText("");
    }
}
