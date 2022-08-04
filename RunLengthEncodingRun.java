package kattis1;

import java.util.*;

public class RunLengthEncodingRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        
        
        String[] line = sc.nextLine().split("");
        /*
        for (int i = 0; i < line.length; i++) {
            System.out.print(line[i]);
        }System.out.println();
        */
        if(code.compareTo("E") == 0){
            //System.out.println(line.length);
            if(line.length == 2) System.out.print(line[1]+1);
            for (int i = 1; i < line.length; i++) {
                for (int j = i; j < line.length; j++) {
                    if(line[i].compareTo(line[j]) != 0){
                        System.out.print(line[i] + (j-i));
                        i = j-1;
                        break;
                    }
                    else if(j == line.length - 1){
                        System.out.print(line[i] + (j-i+1));
                        i = j;
                    }
                }
            }
            System.out.println();
        }
        else{
            for (int i = 1; i < line.length-1; i+=2) {
                for (int j = 0; j < Integer.parseInt(line[i+1]); j++) {
                    System.out.print(line[i]);
                }
            }
            System.out.println();
        }
    }
}
