
import java.util.*;
import java.io.*;

public class DiceCup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int nums = Math.abs(n-m) + 1;
        
        if(n >= m){
            for (int i = 1; i <= nums; i++) {
                System.out.println(m+i);
            }
        }
        else{
            for (int i = 1; i <= nums; i++) {
                System.out.println(n+i);
            }
        }
        
        
    }
}
