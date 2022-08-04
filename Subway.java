package kattis;

import java.util.*;
import java.io.*;

public class Subway {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String[] a = sc.nextLine().split("");
            String[] b = sc.nextLine().split("");
            int dist = 0;
            HashMap<Integer, Integer> aNodes = new HashMap<>();
            for (int j = 0; j < a.length; j++) {
                System.out.println(dist);
                if (a[i].compareTo("0") == 0) {
                    dist++;
                    if (aNodes.containsKey(dist)){
                        int curr = aNodes.get(dist);
                        aNodes.put(dist, curr + 1);
                    }
                    else aNodes.put(dist, 1);
                }
                else {
                    dist--;
                }
            }
            for (Integer key: aNodes.keySet()){
                System.out.println(key);
            }
            dist = 0;
            HashMap<Integer, Integer> bNodes = new HashMap<>();
            for (int j = 0; j < b.length; j++) {
                System.out.println(dist);
                if (b[i].compareTo("0") == 0) {
                    dist++;
                    if (bNodes.containsKey(dist)){
                        int curr = bNodes.get(dist);
                        bNodes.put(dist, curr + 1);
                    }
                    else bNodes.put(dist, 1);
                }
                else {
                    dist--;
                }
            }
            
            boolean same = true;
            //System.out.println(aNodes.keySet().size() + " " + bNodes.keySet().size());
            if (aNodes.keySet().size() == bNodes.keySet().size()){
                System.out.println("same keyset size");
                for(Integer key: aNodes.keySet()){
                    //System.out.println(key);
                    if(!aNodes.get(key).equals(bNodes.get(key))) {
                        same = false;
                        break;
                    }
                }
            }
            else same = false;
            if(same) System.out.println("same");
            else System.out.println("different");
        }
    }
}
