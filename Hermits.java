package kattis;

import java.util.*;
import java.io.*;

public class Hermits {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(String.valueOf(br.readLine()));
        //System.out.println(n);
        
        int[] sts = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sts[i] = Integer.parseInt(line[i]);
            //System.out.print(sts[i]);
        }
        //System.out.println();
        int[] ppl = new int[n];
        for (int i = 0; i < n; i++) {
            ppl[i] = sts[i];
        }
        int m = Integer.parseInt(String.valueOf(br.readLine()));
        for (int i = 0; i < m; i++) {
            String[] cross = br.readLine().split(" ");
            int s1 = Integer.parseInt(String.valueOf(cross[0]));
            //System.out.println(s1);
            int s2 = Integer.parseInt(String.valueOf(cross[1]));
            //System.out.println(s1 + " " + s2);
            
            ppl[s1-1] += sts[s2-1];
            ppl[s2-1] += sts[s1-1];
        }
        br.close();
        /*
        for (int i = 0; i < n; i++) {
            System.out.print(ppl[i]);
        }
*/
        //System.out.println();
        int min = 2;
        for (int i = n-1; i >= 0; i--) {
            if(ppl[i] <= ppl[min]) min = i;
        }
        System.out.println((min+1));
    }
}
