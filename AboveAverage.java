package kattis;

import java.math.RoundingMode;
import java.util.*;
import java.text.*;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int size = sc.nextInt();
            double[] scores = new double[size];
            for (int j = 0; j < size; j++) {
                scores[j] = sc.nextInt();
            }
            double avg = Arrays.stream(scores).average().getAsDouble();
            
            //System.out.println("--"+avg+"--");
            ArrayList<Double> aboveAvg = new ArrayList<>();
            for(double score: scores) if (score > avg){
                //System.out.println(score);
                aboveAvg.add(score);
            }
            //System.out.println(aboveAvg.size());
            double percAbove = (double)aboveAvg.size() / size * 100;
            percAbove = (double)Math.round(percAbove *1000d) / 1000d;
            String strPerc = String.format("%.3f", percAbove);
            //double percentAbove = Arrays.stream(scores).filter(s > avg).count() / scores.length;
            System.out.println(strPerc+"%");
        }
    }
}
