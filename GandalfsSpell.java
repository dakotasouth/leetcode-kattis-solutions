package kattis;

import java.util.*;
import java.io.*;

public class GandalfsSpell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("");
        String[] sent = sc.nextLine().split(" ");
        
        HashMap<String, String> map = new HashMap<>();
        boolean valid = true;
        if(line.length == sent.length){
            for (int i = 0; i < line.length; i++) {
                if(map.containsKey(line[i]) && !map.get(line[i]).equals(sent[i])) {
                    valid = false;
                    break;
                }
                else if(!map.containsKey(line[i]) && !map.containsValue(sent[i])) map.put(line[i], sent[i]);
                else if(map.containsKey(line[i]) && map.get(line[i]).equals(sent[i])) continue;
                else {
                    valid = false;
                    break;
                }
            }
        }
        else{
            valid = false;
        }
        String outp = valid ? "True": "False";
        System.out.println(outp);
    }
}
