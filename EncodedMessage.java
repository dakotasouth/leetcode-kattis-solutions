package kattis;

import java.util.*;
import java.io.*;

public class EncodedMessage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("");
            int dim = (int)Math.sqrt(line.length);
            String[][] mess = new String[dim][dim];
            for (int j = 0; j < dim; j++) {
                for (int k = 0; k < dim; k++) {
                    mess[j][k] = line[j*3 + k];
                }
            }
            
            
        }
    }
}
