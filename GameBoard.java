package com.lpa.tictactoe;

public class GameBoard {

    private char p1S,p2S;
    private char hS = HumanPlayer.humanS;
    private char bS = BotPlayer.botS;

    private int count;
    private char[] board = {'0','0','0',
                            '0','0','0',
                            '0','0','0'};

    public GameBoard(){

    }

    public boolean isFinished(){

        if (count==board.length){
            System.out.println("Draw!");
            return true;
        }
        //for row
        for (int i = 0; i<board.length; i+=3){
            if ( board[i+1]==board[i] && board[i+2]==board[i]){
                if (board[i] == hS) {
                    System.out.println("Human Win!");
                    return true;
                } else if (board[i] == bS) {
                    System.out.println("Bot Win!");
                    return true;
                } else {
                    return false;
                }
            }
        }
        //for column
        for (int i = 0; i<3; i++){
            if ( board[i+3] == board[i] && board[i+6] == board[i]){
                if (board[i] == hS) {
                    System.out.println("Human Win!");
                    return true;
                } else if (board[i] == bS) {
                    System.out.println("Bot Win!");
                    return true;
                } else {
                    return false;
                }
            }
        }
        //
        if(board[4] == board[0] && board[8] == board[0]){
            if (board[0] == hS) {
                System.out.println("Human Win!");
                return true;
            } else if (board[0] == bS) {
                System.out.println("Bot Win!");
                return true;
            } else {
                return false;
            }
        }
        if (board[4] == board[2] && board[6] == board[2]){
            if (board[2] == hS) {
                System.out.println("Human Win!");
                return true;
            } else if (board[2] == bS) {
                System.out.println("Bot Win!");
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public void select(int index, char s){
        if (index<0 || index>=board.length){
            throw new IllegalArgumentException();
        }
        board[index] = s;
        count++;
    }

    public boolean isSelected(int index){
        if (index<0 || index>=board.length){
            throw new IllegalArgumentException();
        }
        return board[index]!='0';
    }

    public void printBoard(){

        System.out.println();
        System.out.println("   -" + "   -" + "   -");
        System.out.println(" | " + board[0] + " | " + board[1] + " | " + board[2] + " | ");
        System.out.println(" | " + board[3] + " | " + board[4] + " | " + board[5] + " | ");
        System.out.println(" | " + board[6] + " | " + board[7] + " | " + board[8] + " | ");
        System.out.println("   -" + "   -" + "   -");

    }

}
