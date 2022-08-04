/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattis;

import java.util.*;

/**
 *
 * @author dakotasouth
 */
public class Islands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[12];
        for (int i=1;i<=n;i++){
            int islands = 0;
            int p = sc.nextInt();
            for (int k=0;k<12;k++) arr[k] = sc.nextInt();
            for(int j=1;j<11;j++){
                //System.out.println(arr[j]);
                if(arr[j-1]<arr[j]){
                    islands++;
                }
                //if(arr[j-1]<arr[j] && arr[j+1]<arr[j]) islands++;
            }
            System.out.println(i+" "+islands);
        }
    }
}
