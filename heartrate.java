import java.util.*;
public class heartrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            double b = sc.nextDouble();
            double p = sc.nextDouble();

            double bpm = (60 * b) / p;
            double minABPM = bpm - (60 / p);
            double maxAPBM = bpm + (60 / p);
            System.out.println(minABPM + " " + bpm + " " + maxAPBM);
        }
    }
}
