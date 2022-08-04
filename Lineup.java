package kattis;

import java.util.*;
import java.io.*;

public class Lineup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            players.add(sc.next());
        }
        /*
        for (int i = 0; i < n; i++) {
            System.out.println(players.get(i));
        }
        */
        ArrayList<String> inc = new ArrayList<>();
        ArrayList<String> dec = new ArrayList<>();
        for(String i: players){
            inc.add(i);
            dec.add(i);
        }
        Collections.sort(inc);
        Collections.sort(dec, Collections.reverseOrder());
        
        /*
        for (int i = 0; i < n; i++) {
            System.out.println(inc.get(i) + " " + dec.get(i) + " " + players.get(i));
        }*/

        if (inc.equals(players)) System.out.println("INCREASING");
        else if(dec.equals(players)) System.out.println("DECREASING");
        else System.out.println("NEITHER");
    }
}
