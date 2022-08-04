package kattis;

import java.util.*;
import java.io.*;

public class Vauvau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int pos = 0;
        boolean dogOneCalm = false;
        boolean dogTwoCalm = false;
        
        boolean dogBiteOne = false;
        boolean dogBiteTwo = false;
        
        while (sc.hasNextInt()){
            int person = sc.nextInt();
            while(pos < person){
                if (dogOneCalm == true) {
                    //System.out.println("Calm");
                    pos += b;
                    dogOneCalm = false;                    
                }else if (dogOneCalm == false){
                    //System.out.println("Aggressive");
                    pos += a;
                    dogOneCalm = true;                    
                }
            }            
            if (dogOneCalm) dogBiteOne = true;
            //System.out.println("-");
            
            pos = 0;
            while(pos < person){
                if (dogTwoCalm == true) {
                    //System.out.println("Calm");
                    pos += d;
                    dogTwoCalm = false;                    
                }else if(dogTwoCalm == false){
                    //System.out.println("Aggressive");
                    pos += c;
                    dogTwoCalm = true;                    
                }
            }
            if (dogTwoCalm) dogBiteTwo = true;
            
            if (dogBiteOne && dogBiteTwo) System.out.println("both");
            else if (dogBiteOne ^ dogBiteTwo) System.out.println("one");
            else if (!dogBiteOne && !dogBiteTwo) System.out.println("none");
            
            pos = 0;
            dogOneCalm = false;
            dogTwoCalm = false;
            dogBiteOne = false;
            dogBiteTwo = false;
            //person = sc.nextInt();
        }
    }
}
