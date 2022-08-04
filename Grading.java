package kattis1;

import java.util.*;
import java.io.*;

public class Grading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] grade = new int[5];
        for (int i = 0; i < 5; i++) {
            grade[i] = sc.nextInt();
        }
        int score = sc.nextInt();
        int finalgrade = -1;
        for (int i = 0; i < 5; i++) {
            if(grade[i] <= score){
                finalgrade = i;
                break;
            }
        }
        if(finalgrade == 0)System.out.println("A");
        if(finalgrade == 1)System.out.println("B");
        if(finalgrade == 2)System.out.println("C");
        if(finalgrade == 3)System.out.println("D");
        if(finalgrade == 4)System.out.println("E");
        if(finalgrade == -1)System.out.println("F");
    }
}
