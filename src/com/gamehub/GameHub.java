package com.gamehub;

import com.gamehub.snake.SnakeGame;

import java.util.Scanner;

public class GameHub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("🎮 Welcome to Shalini's CLI Game Hub! 🎮");
            System.out.println("1. Snake Game");
            System.out.println("2. game2");
            System.out.println("3. game3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starting Snake Game...");
                    SnakeGame.start(); // Call the Snake Game
                    break;
                case 2, 3:
                    System.out.println("currently unavailable. Please choose another game");
                    break;
                case 4:
                    System.out.println("Exiting Game Hub. See you next time!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
