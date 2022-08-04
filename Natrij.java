package kattis;

import java.util.*;
import java.io.*;

public class Natrij {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String end = sc.next();
        //System.out.println(currt+" "+endt);
        
        int sHour = Integer.parseInt(start.substring(0,2));
        int sMin = Integer.parseInt(start.substring(3,5));
        int sSec = Integer.parseInt(start.substring(6,8));
        
        int eHour = Integer.parseInt(end.substring(0,2));
        int eMin = Integer.parseInt(end.substring(3,5));
        int eSec = Integer.parseInt(end.substring(6,8));
        
        eHour *= 3600;
        eMin *= 60;
        
        sHour *= 3600;
        sMin *= 60;
        
        int rawEnd = eHour + eMin + eSec;
        int rawStart = sHour + sMin + sSec;
        
        if (rawEnd <= rawStart) rawEnd += 86400;
        
        int expTime = rawEnd - rawStart;
        
        int expHour = expTime / 3600;
        int expMin = (expTime % 3600) / 60;
        int expSec = (expTime % 3600) % 60;
        
        if(expHour < 10) System.out.print("0"+expHour+":");
        else System.out.print(expHour+":");
        
        if(expMin < 10) System.out.print("0"+expMin+":");
        else System.out.print(expMin+":");
        
        if(expSec < 10) System.out.println("0"+expSec);
        else System.out.println(expSec);
    }
}
