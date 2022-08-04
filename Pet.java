package kattis;

import java.util.*;
import java.io.*;

public class Pet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hScore = 0;
        int winner = 0;
        for (int i = 1; i <= 5; i++) {
            int score = 0;
            for (int j = 0; j < 4; j++) {
                score += sc.nextInt();
            }
            if (score > hScore) {
                hScore = score;
                winner = i;
            } 
        }
        System.out.println(winner + " " + hScore);
    }
}
