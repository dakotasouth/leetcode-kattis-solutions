package kattis1;

import java.util.*;
import java.io.*;

public class LastMinute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int au = sc.nextInt(); 
        int bu = sc.nextInt(); 
        int ar = sc.nextInt(); 
        int br = sc.nextInt(); 
        
        long total = 0;
        //add all combonations of the reusable algos and themes
        total += ar * br;
        //at least 1 reusable algo means all unique themes can be created
        //set to 0 because only 1 time use
        if(br > 0) {
            total += au;
        }
        //at least 1 reusable theme means all unique algos can be created
        if(ar > 0){
            total += bu;
        }
        //add smaller of unique algo or theme
        if(total == 0){
            if(au <= bu) total += au;
            else total += bu;
        }
        
        System.out.println(total);
    }
}
