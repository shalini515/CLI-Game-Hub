package com.gamehub.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    public static void start(){
        System.out.println("Welcome to tic tac toe !❎0️⃣");
        Scanner sc = new Scanner(System.in);
        int[] move = new int[2];
        //Initialize board
        char[][] board = new char[3][3];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = ' ';
            }
        }
        char player;
        int ctr = 0;
        while(true){
            if(ctr % 2 == 0){
                player = 'x';
            }
            else{
                player = 'o';
            }
            printBoard(board);
            System.out.println("player " + player +" can choose a move: ");
            move[0] = sc.nextInt();
            move[1] = sc.nextInt();
            ctr++;
            updateBoard(board, move, player);
            boolean hasWon = CheckIfWon(player, board, move);
            if(hasWon){
                System.out.println("player " + player +" has won");
                break;
            }
            if(ctr == 9){
                System.out.println("game is draw");
                break;
            }
        }
    }

    private static boolean CheckIfWon(char player, char[][] board, int[] move) {
        int x = move[0];
        int y = move[1];
        boolean colMatch = true;
        boolean rowMatch = true;
        for(int i=0; i<board.length; i++){
            if(board[i][y] != player){
                colMatch = false;
            }
            if(board[x][i] != player){
                rowMatch = false;
            }
        }
        return rowMatch || colMatch;
    }

    private static void updateBoard(char[][] board, int[] move, char player) {
        board[move[0]][move[1]] = player;
    }

    private static void printBoard(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]);
                System.out.print('|');
            }
            System.out.println();
        }
    }
}
