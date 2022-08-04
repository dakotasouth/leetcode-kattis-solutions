package kattis;

import java.util.*;
import java.io.*;

public class Distance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> xVals = new ArrayList<>();
        ArrayList<Integer> yVals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            xVals.add(sc.nextInt());
            yVals.add(sc.nextInt());
        }
        Collections.sort(yVals);
        Collections.sort(xVals);
        int sum = 0;
        for (int i = n-1; i > 1; i--) {
            int dX = xVals.get(xVals.size() - 1) - xVals.get(0);
            int dY = yVals.get(yVals.size() - 1) - yVals.get(0);
            
            sum += dX * i;
            sum += dY * i;
        }
        System.out.println(sum);
    }
}
