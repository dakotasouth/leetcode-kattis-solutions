package kattis;

import java.util.*;
import java.io.*;

public class Heliocentric {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casec = 0;
        while(sc.hasNext()){
            casec++;
            int e = sc.nextInt();
            int m = sc.nextInt();
            int toZero = 365 - e;
            
            e += toZero;
            m += toZero;
            int days = toZero;
            
            if(e == 365 && m == 365){
                System.out.println("Case " + casec + ": 0");
                continue;
            }
            while(m % 687 != 0){
                m += 365;
                days += 365;
            }
            System.out.println("Case " + casec + ": " + days);
        }
        
    }
}
