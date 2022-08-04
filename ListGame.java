package kattis;


import java.util.Scanner;

public class ListGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();        
        int score = 1;
        
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i == 0){
                score++;
                x /= i;
                //System.out.println(x);
                i--;
            }
        }
        System.out.println(score); 
    }
}
