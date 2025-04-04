package com.gamehub;

import com.gamehub.snake.SnakeGame;
import com.gamehub.wordguess.WordGuessGame;

import java.util.Scanner;

public class GameHub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while(true) {
            System.out.println("🎮 Welcome to Shalini's CLI Game Hub! 🎮");
            System.out.println("1. Snake Game");
            System.out.println("2. Word Guessing Game");
            System.out.println("3. TicTacToe");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Starting Snake Game...");
                    SnakeGame.start(); // Call the Snake Game
                    break;
                case "2":
                    System.out.println("Starting Word Guessing Game...");
                    WordGuessGame.start();
                    break;
                case "3":
                    System.out.println("Starting Tic Tac Toe...");

                    break;
                case "4":
                    System.out.println("Exiting Game Hub. See you next time!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
