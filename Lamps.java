package kattis;

import java.util.*;
import java.io.*;

public class Lamps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int price = sc.nextInt();
       
        double incSum = 5;
        double lowSum = 60;
       
        double lowsCost = (11 * hours * price) / 100000.00;
        double incCost = (60 * hours * price) / 100000.00;
        int incHours = 0;
        boolean cheaper = false;
        int days = 0;
       
        for (int i = 1; i <= 100000; i++) {
            incSum += incCost;
            lowSum += lowsCost;
            incHours += hours;
            //System.out.println(i);
            //System.out.println(incSum + " " + lowSum);
            if((incHours > 1000)) {
                incSum += 5;
                incHours -= 1000;
            }
            if(lowSum < incSum) {
                cheaper = true;
                days = i;
                break;
            }
        }
        if(cheaper){
            System.out.println(days);
        }
        //else System.out.println(8000.00 / hours + 1);
    }
}

