package kattis;

import java.util.*;

public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        int totalMinutes = hour * 60 + minute;
        
        totalMinutes -= 45;
        
        if (totalMinutes < 0) totalMinutes += 1440;
        
        System.out.println(totalMinutes/60 + " " + totalMinutes%60);
    }
}
