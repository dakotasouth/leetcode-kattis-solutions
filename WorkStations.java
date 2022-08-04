package kattis;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dakotasouth
 */
public class WorkStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int saves = 0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int s = sc.nextInt();
            
            if(a < m) saves++;
        }
        System.out.println(saves);
    }
}
