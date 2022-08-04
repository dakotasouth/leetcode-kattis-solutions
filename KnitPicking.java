package kattis1;

import java.util.*;
import java.io.*;

public class KnitPicking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> any = new HashMap<>();
        HashMap<String, Integer> left = new HashMap<>();
        HashMap<String, Integer> right = new HashMap<>();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            //System.out.println(line[0] + " " + line[1] + " " + line[2]);
            if(line[1].compareTo("any") == 0) any.put(line[0], Integer.parseInt(line[2]));
            else if(line[1].compareTo("left") == 0) left.put(line[0], Integer.parseInt(line[2]));
            else right.put(line[0], Integer.parseInt(line[2]));
        }
        boolean possible = false;
        int sockCount = 0;
        for(String i: left.keySet()) {
            if (right.containsKey(i)){
                possible = true;
                if(left.get(i) > right.get(i)) sockCount += left.get(i);
                else sockCount += right.get(i);
            }
            else if (any.containsKey(i)){
                possible = true;
                sockCount += left.get(i);
            }
            else sockCount += left.get(i);
        }
        for(String i: right.keySet()){
            if(!left.containsKey(i)){
                if(any.containsKey(i)){
                    possible = true;
                    sockCount += right.get(i);
                }
                else sockCount += right.get(i);
            }
        }
        if(!possible){
            for(String i: any.keySet()){
                sockCount += 1;
                if (any.get(i) > 1) possible = true;
            }
        }
        else {
            for(String i: any.keySet()){
                if(!right.containsKey(i) && !left.containsKey(i)){
                    sockCount += 1;
                }
            }
            
        }
        
        if(possible) System.out.println(sockCount + 1);
        else System.out.println("impossible");
    }
}
