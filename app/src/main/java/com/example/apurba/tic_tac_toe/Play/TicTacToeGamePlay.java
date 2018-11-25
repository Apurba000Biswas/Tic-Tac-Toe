package com.example.apurba.tic_tac_toe.Play;

import android.view.View;

import com.example.apurba.tic_tac_toe.Activity.LauncherActivity;
import com.example.apurba.tic_tac_toe.R;

public class TicTacToeGamePlay implements View.OnClickListener{

    private int[][] gamePlayGrid;

    public TicTacToeGamePlay(){
        setGamePlayGrid();
    }

    private void setGamePlayGrid(){
        gamePlayGrid = new int[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                gamePlayGrid[row][col] = 0;
            }
        }
    }



    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.tv_fist_row_1:
                updateState(0,0);
                break;
            case R.id.tv_fist_row_2:
                updateState(0,1);
                break;
            case R.id.tv_fist_row_3:
                updateState(0,2);
                break;
            case R.id.tv_second_row_1:
                updateState(1,0);
                break;
            case R.id.tv_second_row_2:
                updateState(1,1);
                break;
            case R.id.tv_second_row_3:
                updateState(1,2);
                break;
            case R.id.tv_third_row_1:
                updateState(2,0);
                break;
            case R.id.tv_third_row_2:
                updateState(2,1);
                break;
            case R.id.tv_third_row_3:
                updateState(2,2);
                break;
        }
        printState();
    }

    private void printState(){
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print(gamePlayGrid[row][col] + " ");
            }
            System.out.println();
        }
    }

    private void updateState(int row, int col){
        if (gamePlayGrid[row][col] == 0){
            gamePlayGrid[row][col] = 1;
            LauncherActivity.setmFirstRowFirstTv();
        }
    }
}
