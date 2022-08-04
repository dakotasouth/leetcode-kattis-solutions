package kattis;

import java.util.Scanner;

/**
 *
 * @author dakotasouth
 */
public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        String evenOdd = "Even";
        int points = 0;
        
        if (left > right) {
            evenOdd = "Odd";
            points = left*2;
        }
        else if(right > left){
            evenOdd = "Odd";
            points = right*2;
        }
        else if(left == right) {
            evenOdd = "Even";
            points = right + left;
        }
        if (points == 0) System.out.println("Not a moose");
        else System.out.println(evenOdd + " " + points);
        
    }
}
