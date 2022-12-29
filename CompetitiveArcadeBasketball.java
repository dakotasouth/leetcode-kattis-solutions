
import java.util.*;
import java.io.*;

public class CompetitiveArcadeBasketball {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int p = Integer.parseInt(line[1]);
        int m = Integer.parseInt(line[2]);
        
        HashMap<String, Integer> players = new HashMap<>();
        ArrayList<String> done = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            players.put(br.readLine(), 0);
        }
        boolean won = false;
        for (int i = 0; i < m; i++) {
            String[] score = br.readLine().split(" ");
            if(players.containsKey(score[0])){
                int currScore = players.get(score[0]);
                players.put(score[0], currScore + Integer.parseInt(score[1]));
            }
            if (players.get(score[0]) >= p && !done.contains(score[0])) {
                System.out.println(score[0]+ " wins!");
                done.add(score[0]);
                won = true;
            }
        }
        if (!won) System.out.println("No winner!");
    }
}
