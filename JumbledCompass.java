package kattis;

import java.util.*;
import java.io.*;

public class JumbledCompass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int curr = sc.nextInt();
        int correct = sc.nextInt();
        
        int dis = 0;
        int mindis = 0;
        
        if (curr > correct){
            dis = curr - correct;
            if (dis >= 180) mindis = 360 - curr + correct;
            else mindis = dis * -1;
        }
        else{
            dis = correct - curr;
            if (dis > 180) mindis = (360 - correct + curr) * -1;
            else mindis = dis;
        }
        System.out.println(mindis);
    }
}
