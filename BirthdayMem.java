/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattis;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dakotasouth
 */
public class BirthdayMem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] scoreList = new int[366];
        String[] names = new String[366];
        for (int i = 0; i < 366; i++) {
            scoreList[i] = 0;
        }
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            String date = sc.next();
            int dayOfYear = dateToInt(date);
            
            if(scoreList[dayOfYear-1] < score) {
                scoreList[dayOfYear-1] = score;
                names[dayOfYear-1] = name;
            }
        }
        int count = 0;
        for (int i = 0; i < 366; i++) {
            if (names[i] != null) count++;
        }
        System.out.println(count);
        String[] allNames = new String[count];
        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (names[i] != null) {
                allNames[counter] = names[i];
                counter++;
            }
        }
        Arrays.sort(allNames);
        for (String allName : allNames) {
            System.out.println(allName);
        }
    }
    public static int dateToInt(String date){       
        int day = Integer.valueOf(date.substring(0, 2));
        int month = Integer.valueOf(date.substring(3, 5));
        int dayOfYear = 0;
        switch (month) {
            case 1:
                dayOfYear = 0;
                break;
            case 2:
                dayOfYear = 31;
                break;
            case 3:
                dayOfYear = 60;
                break;
            case 4:
                dayOfYear = 91;
                break;
            case 5:
                dayOfYear = 121;
                break;
            case 6:
                dayOfYear = 152;
                break;
            case 7:
                dayOfYear = 182;
                break;
            case 8:
                dayOfYear = 213;
                break;
            case 9:
                dayOfYear = 244;
                break;
            case 10:
                dayOfYear = 274;
                break;
            case 11:
                dayOfYear = 335;
                break;
            case 12:
                dayOfYear = 366;
                break;
            default:
                break;
        }
        return dayOfYear += day;
        
         
    }
    
}
