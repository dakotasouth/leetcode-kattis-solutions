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
public class RollCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        
        for(int i=0;i<6;i++){
            arr[i] = sc.nextLine();
        }
        
        for(int j=0;j<6;j++) System.out.println(arr[j]);
    }
}
