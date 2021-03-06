package com.example.apurba.tic_tac_toe.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
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

    private static TextView  mInstructionTv;
    private CardView mNewGameButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        CustomStyle.setCustomAppBar(this, getSupportActionBar());

        initializeButtons();
        setAnimation();
        playGame();
        setNewGameButton();
    }

    private void setNewGameButton(){
        mNewGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearText();
                setAnimation();
                playGame();
            }
        });
    }

    private void clearText(){
        mFirstRowFirstTv.setText("");
        mFirstRowSecondTv.setText("");
        mFirstRowThirdTv.setText("");

        mSecondRowFirstTv.setText("");
        mSecondRowSecondTv.setText("");
        mSecondRowThirdTv.setText("");

        mThirdRowFirstTv.setText("");
        mThirdRowSecondTv.setText("");
        mThirdRowThirdTv.setText("");
        mInstructionTv.setTextSize(18);
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

        mInstructionTv = findViewById(R.id.tv_instruction);
        mNewGameButton = findViewById(R.id.cv_new_game);
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
        CustomStyle.setUpAnimationToCard(this, mNewGameButton);
    }



    private void playGame(){
        TicTacToeGamePlay play = new TicTacToeGamePlay(mInstructionTv, this);
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


    public static void lockTheButton(int buttonNo, boolean isPlayerX){
        switch (buttonNo){
            case 1:
                if (isPlayerX){
                    mFirstRowFirstTv.setText("X");
                }else{
                    mFirstRowFirstTv.setText("O");
                }
                break;
            case 2:
                if (isPlayerX){
                    mFirstRowSecondTv.setText("X");
                }else{
                    mFirstRowSecondTv.setText("O");
                }
                break;
            case 3:
                if (isPlayerX){
                    mFirstRowThirdTv.setText("X");
                }else{
                    mFirstRowThirdTv.setText("O");
                }
                break;
            case 4:
                if (isPlayerX){
                    mSecondRowFirstTv.setText("X");
                }else{
                    mSecondRowFirstTv.setText("O");
                }
                break;
            case 5:
                if (isPlayerX){
                    mSecondRowSecondTv.setText("X");
                }else{
                    mSecondRowSecondTv.setText("O");
                }
                break;
            case 6:
                if (isPlayerX){
                    mSecondRowThirdTv.setText("X");
                }else{
                    mSecondRowThirdTv.setText("O");
                }
                break;
            case 7:
                if (isPlayerX){
                    mThirdRowFirstTv.setText("X");
                }else{
                    mThirdRowFirstTv.setText("O");
                }
                break;
            case 8:
                if (isPlayerX){
                    mThirdRowSecondTv.setText("X");
                }else{
                    mThirdRowSecondTv.setText("O");
                }
                break;
            case 9:
                if (isPlayerX){
                    mThirdRowThirdTv.setText("X");
                }else{
                    mThirdRowThirdTv.setText("O");
                }
                break;
        }
    }
}
