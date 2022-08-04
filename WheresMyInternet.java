package kattis;

import java.util.*;

public class WheresMyInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houses = sc.nextInt();
        int cables = sc.nextInt();
        ArrayList<Integer> connected = new ArrayList<>();
        Map<Integer,Integer> housesList = new HashMap<>();
        Map<Integer,Integer> listHouses = new HashMap<>();
        connected.add(1);
        
        for (int i = 0; i < cables; i++) {
            int houseA = sc.nextInt();
            int houseB = sc.nextInt();
            housesList.put(houseA, houseB);
            listHouses.put(houseB, houseA);
            if (connected.contains(houseA)) connected.add(houseB);
            else if (connected.contains(houseB)) connected.add(houseA);
        }
        for (int i = 1; i < houses+1; i++) {
            if (!connected.contains(i)){
                if (housesList.containsKey(i) && )
            }
        }
        int count = 0;
        for (int i = 1; i < houses+1; i++) {
            if (!connected.contains(i)) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) System.out.println("Connected");
    }
    
}
