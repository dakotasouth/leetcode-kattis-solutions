package kattis;

import java.util.*;
import java.io.*;

public class CD {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        //sc.nextLine();
        
        while(n != 0 && m != 0){
            System.out.println(n + " " + m);

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(String.valueOf(br.read()));
                System.out.println(num);
                set.add(num);
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                int check = Integer.parseInt(String.valueOf(br.read()));
                System.out.println(check);
                if(!set.add(check)) count++;
            }
            System.out.println(count);
            line = br.readLine().split(" ");
            System.out.println(line[0]);
            n = Integer.parseInt(String.valueOf(line[0]));
            m = Integer.parseInt(String.valueOf(line[1]));
            
        }
    }
}
