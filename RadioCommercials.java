package kattis;

import java.util.*;
import java.io.*;

public class RadioCommercials {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int breaks = sc.nextInt();
        int cost = sc.nextInt();
        int[] profits = new int[breaks];
        
        for (int i = 0; i < breaks; i++) {
            profits[i] = sc.nextInt() - cost;
        }
        int[] currArr = profits;
        int[] oldArr = new int[breaks];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < currArr.length; i++) {//first loop through single break profits
            if (currArr[i] > maxProfit) maxProfit = currArr[i];
        }
        for (int i = breaks; i > 0; i--) {
            int[] newArr = new int[i-1];
            if (i == breaks){
                for (int j = 0; j < currArr.length - 1; j++) {
                    newArr[j] = currArr[j] + currArr[j+1];
                    if (newArr[j] > maxProfit) maxProfit = newArr[j];
                }
            }else{
                for (int j = 0; j < currArr.length - 1; j++) {
                    newArr[j] = currArr[j] - (oldArr[j+1] - currArr[j+1]);
                    if (newArr[j] > maxProfit) maxProfit = newArr[j];
                }
            }
            /*
            for (int j = 0; j < currArr.length; j++) {
                System.out.print(currArr[j]+" ");
            }System.out.println();
            */
            oldArr = currArr;
            currArr = newArr;
        }
        System.out.println(maxProfit);
    }
}
