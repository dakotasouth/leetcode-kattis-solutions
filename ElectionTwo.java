package kattis;

import java.util.*;
import java.io.*;

public class ElectionTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String> cand = new HashMap<>();
        HashMap<String, Integer> votes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String party = sc.nextLine();
            //System.out.println(name + " " + party);
            cand.put(name, party);
        }
        int m = sc.nextInt();
        sc.nextLine();
        for(String key: cand.keySet()){
            votes.put(key, 0);
        }
        for (int i = 0; i < m; i++) {
            String name = sc.nextLine();
            if (cand.containsKey(name)){
                int currV = votes.get(name);
                votes.put(name, currV + 1);
            }
        }
        int max = 0;
        
        String winner = "";
        for(String key: votes.keySet()){
            if(votes.get(key) > max) {
                max = votes.get(key);
                winner = key;
            }
        }
        int totWinners = 0;
        for(Integer total: votes.values()){
            //System.out.println(total);
            if (total == max) totWinners++;
        }
        if(totWinners > 1){
            System.out.println("tie");
        }
        else{
            System.out.println(cand.get(winner));
        }
    }
}
