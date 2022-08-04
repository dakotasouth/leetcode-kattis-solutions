package kattis;

import java.util.*;
import java.io.*;

public class SpidermanWorkout {
    public static void main(String[] args){            
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        for (int i = 0; i < cases; i++) {
            int distances = sc.nextInt();
            int[] arr = new int[distances];
            int totalDis = 0;
            int bigInt = 0;
            for (int j = 0; j < distances; j++) {
                int d = sc.nextInt();
                arr[j] = d;
                totalDis += d;                
                if (d > bigInt) bigInt = d;
            }
            //bigInt += 2;
            int position = 0;
            int disLeft = totalDis;
            String[] upDowns = new String[distances];
            boolean imp = false;
            for (int j = 0; j < arr.length; j++) {
                //try up
                /*
                System.out.println("position: " + position);
                System.out.println("distance left: "+disLeft);
                System.out.println("biggest integer: "+bigInt);
                System.out.println("current arr element: "+ arr[j]);
                */
                //try up
                if(position + arr[j] <= bigInt && position + arr[j] <= disLeft - arr[j]){
                    position += arr[j];
                    disLeft -= arr[j];
                    upDowns[j] = "U";                   
                }
                //try down
                else if(position - arr[j] >= 0){
                    position -= arr[j];
                    disLeft -= arr[j];
                    upDowns[j] = "D";
                }
                // if neither worked then go up past max height
                else if(position + arr[j] > bigInt && position + arr[j] <= disLeft - arr[j]){
                    position += arr[j];
                    disLeft -= arr[j];
                    bigInt = position;
                    upDowns[j] = "U";
                }
                else{
                    imp = true;
                    break;
                }
            }
            if (position != 0) imp = true;
            if(imp) System.out.println("IMPOSSIBLE");
            else {
                for (int j = 0; j < distances; j++) {
                    System.out.print(upDowns[j]);
                }
                System.out.println();
            }
        }
    }
}
