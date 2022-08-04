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
public class HangingOutOnTheTerrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fireLim = sc.nextInt();
        int events = sc.nextInt();
        int group = 0;
        int denies = 0;
        
        for(int i=0;i<events;i++){
            String s = sc.next();
            int people = sc.nextInt();
            
            if(s.compareTo("enter") == 0){
                if(group+people > fireLim) denies++;
                else group += people;
            }else group -= people;
        }
        System.out.println(denies);
        
        
    }
}
