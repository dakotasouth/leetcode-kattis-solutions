package kattis;


import java.util.Scanner;


public class TrainPassengers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int passengers = 0;
        String result = "possible";
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            passengers -= x;
            passengers += y;
            //System.out.println(passengers);
            
            if (passengers > c || passengers < 0) result = "impossible";
            else if (passengers < c && z > 0) result = "impossible";
        }
        if (passengers > 0) result = "impossible";
        System.out.println(result);
    }
}
