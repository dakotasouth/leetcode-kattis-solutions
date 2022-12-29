
import java.util.*;
import java.io.*;

public class Batteries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] lim = new int[100];
        lim[0] = 0;
        
        for (int i = 1; i < 100; i++) {
            lim[i] = lim[i-1] + i; 
        }
        //System.out.println("done");
        
        int n = sc.nextInt();
        
        while(n != 0){
            int x = 0;
            for (int i = 0; i < 99; i++) {
                if (n == 1) x = 0;
                if (n == 2) x = 1;
                else if (n > lim[i] && n <= lim[i+1]){
                    x = i+1;
                }
            }
            System.out.println(x);
            n = sc.nextInt();
        }
        
        
    }
}
