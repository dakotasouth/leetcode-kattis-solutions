
import java.util.*;
import java.io.*;

public class BatterUp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double den = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double q = sc.nextInt();
            if (q != -1) {
                sum += q;
                den++;
            }
        }
        System.out.println(sum / den);
    }
}
