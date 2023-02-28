package com.lpa.tictactoe;

import java.util.Scanner;

public class HumanPlayer {
    private static Scanner scanner = new Scanner(System.in);
    static char humanS = 'X';

    private HumanPlayer(){
    }

    public static void play(GameBoard gameBoard){
        while (true) {
            System.out.print("Enter Your Position :  ");
            int position = scanner.nextInt();
            if (gameBoard.isSelected(position)) {
                continue;
            }
            gameBoard.select(position,humanS);
            break;
        }
    }

}
