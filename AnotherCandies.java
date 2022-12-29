
import java.util.*;
import java.io.*;
import java.math.*;

public class AnotherCandies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        String line = sc.nextLine();
        for (int i = 0; i < cases; i++) {
            String lines = sc.nextLine();
            
            BigInteger kids = new BigInteger(sc.nextLine());
            BigInteger totalCandy = new BigInteger("0");            
            for (int j = 0; j < kids.intValue(); j++) {
                BigInteger candy = new BigInteger(sc.nextLine());
                totalCandy = totalCandy.add(candy);                 
            }
                        
            if(totalCandy.remainder(kids).intValue() == 0) {
                System.out.println("YES");
                //System.out.println((totalCandy.remainder(kids).intValue()));
            } 
            else if(totalCandy.remainder(kids).intValue() != 0) {
                System.out.println("NO");
                //System.out.println((totalCandy.remainder(kids).intValue()));
            }
        }
        
    }
}
