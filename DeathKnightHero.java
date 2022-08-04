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
public class DeathKnightHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int wins = 0; 
        int losses = 0;
        
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            System.out.println(line);
            
            for (int j = 0; j < line.length()-1; j++) {
                if(line.substring(i, i).compareTo("C") == 0 && line.substring(i+1, i+1).compareTo("D") == 0) losses++;                
            }
        }
        System.out.println(losses);
        System.out.println(n-losses);
        
    }
}
