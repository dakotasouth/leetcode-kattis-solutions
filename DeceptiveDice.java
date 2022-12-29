
import java.util.*;
import java.io.*;

public class DeceptiveDice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sides = sc.nextInt();
        double rolls = sc.nextInt();
        
        Random rand = new Random();
        
        double sum = 0;
        
        for (int i = 0; i < 2000; i++) {
            double score = 0;
            for (int j = 0; j < rolls; j++) {
                score = (int)Math.floor(Math.random()*(sides-1+1)+1);
                
                if ((score/sides) > .5) break;
            }
            sum+= score;
            //System.out.println(score);
        }
        double avg = sum / 2000;
        System.out.println("Average: "+avg);
    }
}
