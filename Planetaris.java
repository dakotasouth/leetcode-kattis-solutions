package kattis;

import java.util.*;
import java.io.*;

public class Planetaris {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ships = sc.nextInt();
        
        ArrayList<Integer> planets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            planets.add(sc.nextInt());
        }
        Collections.sort(planets);
        int count = 0;
        
        for (int p: planets) {
            ships -= (p + 1);
            //System.out.print(ships + "--" + p + " ");
            if(ships >= 0) count++;
            else break;
        }
        System.out.println(count);
    }
}
