package kattis;

import java.util.*;

public class TwentyFortyEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[j][i] = sc.nextInt();
            }
        }
        int direction = sc.nextInt();
        move(board, direction);
        
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(board[j][i] + " ");
            }System.out.println();
        }
        
    }
    public static int[][] move(int[][] board, int direction){
        //left
        if (direction == 0){
            for (int i = 0; i < 4; i++) {
                for (int j = 3; j >= 1; j--) {
                    if(board[j-1][i] == 0){
                        board[j-1][i] = board[j][i];
                        board[j][i] = 0;
                    }else if(board[j-1][i] == board[j][i]){
                        board[j-1][i] = board[j-1][i] * 2;
                        board[j][i] = 0;
                    }
                }
            }
        }
        return board;
    }
}
