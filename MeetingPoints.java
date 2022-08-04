package kattis1;

import java.util.*;
import java.io.*;

public class MeetingPoints {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> slopes = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double x2 = sc.nextInt();
            double y2 = sc.nextInt();
            
            
            double slp = 0;
            if(x2-x1 == 0) slp = Double.MAX_VALUE;
            else if(y2-y1 == 0) slp = 0;
            else slp = (y2-y1) / (x2-x1);
            //System.out.println(slp);
            int curr = 0;
            if (slopes.containsKey(String.valueOf(slp))){
                curr = slopes.get(String.valueOf(slp));
                slopes.put(String.valueOf(slp), curr + 1);
            }
            else slopes.put(String.valueOf(slp), 1);
        }
        int count = 0;
        int offset = 0;
        for (String key: slopes.keySet()){
            offset += slopes.get(key);
            count += (n-offset) * slopes.get(key);
            //System.out.println(key + " --- " + n + " - " + offset + " * " + slopes.get(key) + " = " + count);
        }
        System.out.println(count);
    }
}
