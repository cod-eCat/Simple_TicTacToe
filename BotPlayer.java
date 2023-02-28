package com.lpa.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class BotPlayer {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    static char botS = 'Y';

    private BotPlayer(){

    }

    public static void play(GameBoard gameBoard) {

        System.out.println("Bot is thinking ...");

        int position = 0;
        while (true) {
            position = random.nextInt(9);
            if (gameBoard.isSelected(position)) {
                continue;
            }
            gameBoard.select(position, botS);
            break;
        }

    }

}
