/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattis;

import java.util.Scanner;

/**
 *
 * @author dakotasouth
 */
public class IslandsTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        String[][] island = new String[col][row];
        
        for (int i = 0; i < row; i++) {
            island[i] = sc.nextLine().split("");
        }
        
    }
}
