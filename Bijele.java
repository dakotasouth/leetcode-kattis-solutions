package kattis;
import java.util.*;
public class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pieces = {1,1,2,2,2,8};
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.print(pieces[i] - arr[i] + " ");
        }
    }
}
