package kattis;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class GrassSeed {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        double lawns = sc.nextDouble();
        double total = 0;
        for (int i = 0; i < lawns; i++) {
            double len = sc.nextDouble();
            double wid = sc.nextDouble();
            total += len*wid*cost;
        }
        DecimalFormat numberFormat = new DecimalFormat("#.0000000");
        System.out.println(numberFormat.format(total));    
        
    }
}
