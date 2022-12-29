import java.util.*;
public class ratingproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(); 
        double k = sc.nextDouble();
        double sum = 0;
        for(int i=0;i<k;i++){
            sum += sc.nextDouble();
        }
        System.out.println((sum + (-3*(n-k))) / n);
        System.out.println((sum + (3*(n-k))) / n);

    }
}
