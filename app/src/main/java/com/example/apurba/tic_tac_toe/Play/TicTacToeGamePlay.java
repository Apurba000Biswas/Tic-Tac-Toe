package com.example.apurba.tic_tac_toe.Play;

import android.view.View;
import android.widget.TextView;

import com.example.apurba.tic_tac_toe.Activity.LauncherActivity;
import com.example.apurba.tic_tac_toe.R;

import java.util.Random;

public class TicTacToeGamePlay implements View.OnClickListener{
    private static final String INSTRUCTION_X = "Its X's turn";
    private static final String INSTRUCTION_O = "Its O's turn";
    private static final String INSTRUCTION_LOCKED = "This button is locked";
    private static final String INSTRUCTION_X_WINNER = "X is WINNER!";
    private static final String INSTRUCTION_O_WINNER = "O is WINNER!";
    private static final String INSTRUCTION_NO_WINNER = "Game Ended, No one is Winner!";
    private static final String INSTRUCTION_BOTH_WINNER = "Both are Winner!";
    private static final String INSTRUCTION_FIRST_P_SYMBOL = "First Player's Symbol";

    private int[][] gamePlayGrid;
    private TextView mInstructionTv;
    private int playerSelected;
    private int lockedButton;

    public TicTacToeGamePlay(TextView instructionTv){
        setGamePlayGrid();
        mInstructionTv = instructionTv;
        setPlayerSelection();
        lockedButton = 0;
    }

    private void setPlayerSelection(){
        Random rand = new Random();
        boolean firstSlectionKey = rand.nextBoolean();
        if (firstSlectionKey){
            playerSelected = 1;
            mInstructionTv.setText(INSTRUCTION_FIRST_P_SYMBOL + " 'X'");
        }else{
            mInstructionTv.setText(INSTRUCTION_FIRST_P_SYMBOL + " 'O'");
            playerSelected = 2;
        }
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
                if (!isLocked(0, 0)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(1, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(1, false);
                    }
                    updateState(0,0);
                }
                break;
            case R.id.tv_fist_row_2:
                if (!isLocked(0, 1)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(2, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(2, false);
                    }
                    updateState(0,1);
                }
                break;
            case R.id.tv_fist_row_3:
                if (!isLocked(0, 2)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(3, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(3, false);
                    }
                    updateState(0,2);
                }
                break;
            case R.id.tv_second_row_1:
                if (!isLocked(1, 0)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(4, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(4, false);
                    }
                    updateState(1,0);
                }
                break;
            case R.id.tv_second_row_2:
                if (!isLocked(1, 1)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(5, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(5, false);
                    }
                    updateState(1,1);
                }
                break;
            case R.id.tv_second_row_3:
                if (!isLocked(1, 2)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(6, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(6, false);
                    }
                    updateState(1,2);
                }
                break;
            case R.id.tv_third_row_1:
                if (!isLocked(2, 0)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(7, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(7, false);
                    }
                    updateState(2,0);
                }
                break;
            case R.id.tv_third_row_2:
                if (!isLocked(2, 1)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(8, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(8, false);
                    }
                    updateState(2,1);
                }
                break;
            case R.id.tv_third_row_3:
                if (!isLocked(2, 2)){
                    if (playerSelected == 1){
                        LauncherActivity.lockTheButton(9, true);
                    }else if (playerSelected == 2){
                        LauncherActivity.lockTheButton(9, false);
                    }
                    updateState(2,2);
                }
                break;
        }
        checkForGameEnd();
    }

    private void checkForGameEnd(){
       if (lockedButton == 9){
            String resultSameRow = checkForSameRowValue();
            String resultSameCol = checkForSameColumnValues();
            String resultFirstDiagonal = checkForSameFirstDiagonalValues();
            String resultSecondDiagonal = checkForSameSecondDiagonalValue();
            if(!resultSameRow.equals("-1")){
                declareWinner(resultSameRow);
            }else if (!resultSameCol.equals("-1")){
                declareWinner(resultSameCol);
            }else if (!resultFirstDiagonal.equals("-1")){
                declareWinner(resultFirstDiagonal);
            }else if (!resultSecondDiagonal.equals("-1")){
                declareWinner(resultSecondDiagonal);
            }else{
                mInstructionTv.setText(INSTRUCTION_NO_WINNER);
            }
       }
    }

    private String checkForSameRowValue() {
        String res = "";
        for(int row=0; row<3; row++) {
            int value = gamePlayGrid[row][0];
            if(value != gamePlayGrid[row][1]) {
                continue;
            }else if(value != gamePlayGrid[row][2]) {
                continue;
            }
            res += value;
        }
        if(res.isEmpty()) {
            return "-1";
        }
        return res;
    }

    private String checkForSameColumnValues() {
        String res = "";
        for(int col=0; col<3; col++) {
            int value = gamePlayGrid[0][col];
            if(value != gamePlayGrid[1][col]) {
                continue;
            }else if(value != gamePlayGrid[2][col]) {
                continue;
            }
            res += value;
        }
        if(res.isEmpty()) {
            return "-1";
        }
        return res;
    }

    private String checkForSameFirstDiagonalValues() {
        String res = "";
        int value = 0;
        for(int i=0; i<2; i++) {
            value = gamePlayGrid[i][i];
            if(value != gamePlayGrid[i+1][i+1]) {
                return "-1";
            }else {
                res = Integer.toString(value);
            }
        }
        return res;
    }

    private String checkForSameSecondDiagonalValue() {
        String res = "";
        int value = 0;
        int column = 2;
        for(int i=0; i<2; i++) {
            value = gamePlayGrid[i][column];
            if(value != gamePlayGrid[i+1][column-1]) {
                return "-1";
            }else {
                res = Integer.toString(value);
            }
            column--;

        }
        return res;
    }

    private void declareWinner(String result){
        int res = Integer.parseInt(result);
        switch (res){
            case 1:
                mInstructionTv.setText(INSTRUCTION_X_WINNER);
                break;
            case 2:
                mInstructionTv.setText(INSTRUCTION_O_WINNER);
                break;
            case 12 :
                mInstructionTv.setText(INSTRUCTION_BOTH_WINNER);
                break;
            case 21:
                mInstructionTv.setText(INSTRUCTION_BOTH_WINNER);
                break;
        }
    }

    private boolean isLocked(int row, int col){
        if (gamePlayGrid[row][col] == 0){
            return false;
        }else{
            mInstructionTv.setText(INSTRUCTION_LOCKED);
            return true;
        }
    }

    private void updateState(int row, int col){
        if (playerSelected == 1){
            gamePlayGrid[row][col] = 1;
            playerSelected = 2;
            mInstructionTv.setText(INSTRUCTION_O);
        }else if (playerSelected == 2){
            gamePlayGrid[row][col] = 2;
            playerSelected = 1;
            mInstructionTv.setText(INSTRUCTION_X);
        }
        lockedButton++;
    }
}
