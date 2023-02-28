package com.lpa.tictactoe;

    /*
    @Author - LwinPhyoAung
    Simple TicTacToe
    */

public class TicTacToe {

    public static void main(String[] args) {

        guide();
        play();

    }







    public static void guide(){
        System.out.println("###############");
        System.out.println("LwinPhyoAung's Stupid TicTacToe:')");
        System.out.println("Position : 0-8");
        System.out.println("Human - X");
        System.out.println("Bot - Y");
        System.out.println("###############");
    }

    public static void play(){
        GameBoard gameBoard = new GameBoard();

        while (true) {
            HumanPlayer.play(gameBoard);
            gameBoard.printBoard();
            if (gameBoard.isFinished()){
                break;
            }
            BotPlayer.play(gameBoard);
            gameBoard.printBoard();
            if (gameBoard.isFinished()){
                break;
            }
        }
    }

}
