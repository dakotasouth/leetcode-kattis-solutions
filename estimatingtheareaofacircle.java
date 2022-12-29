import java.util.*;
public class estimatingtheareaofacircle {
    // For each test case, print a line containing two numbers: the true area of the square and the estimate with error of at most 10^-5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while radius, points in circle, total points are not 0
        double r = sc.nextDouble();
        double m = sc.nextDouble();
        double c = sc.nextDouble();

        while(r != 0 && m != 0 && c != 0){
            double area = Math.PI * Math.pow(r,2);
            double estArea = (c/m) * Math.pow(2*r,2);
            System.out.println(area + " " + estArea);
            r = sc.nextDouble();
            m = sc.nextDouble();
            c = sc.nextDouble();
        }
    }
}
