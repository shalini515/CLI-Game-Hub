package com.gamehub.wordguess;

import java.util.Scanner;
import java.util.Random;

public class WordGuessGame {
    private static final String[] WORDS = {"java", "python", "code", "program", "developer"};
    private static final int MAX_ATTEMPTS = 6;

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String wordToGuess = WORDS[random.nextInt(WORDS.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attemptsLeft = MAX_ATTEMPTS;

        System.out.println("🎯 Welcome to Word Guessing Game!");
        System.out.println("Guess the word: " + new String(guessedWord));

        while (attemptsLeft > 0 && new String(guessedWord).contains("_")) {
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            boolean correct = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correct = true;
                }
            }

            if (!correct) {
                attemptsLeft--;
                System.out.println("❌ Incorrect! Attempts left: " + attemptsLeft);
            } else {
                System.out.println("✅ Correct! Progress: " + new String(guessedWord));
            }
        }

        if (new String(guessedWord).equals(wordToGuess)) {
            System.out.println("🎉 Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("☹️ Game Over! The word was: " + wordToGuess);
        }
    }
}

