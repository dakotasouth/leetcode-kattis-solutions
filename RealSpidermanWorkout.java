package kattis;

import java.util.*;
import java.io.*;

public class RealSpidermanWorkout {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dist = new ArrayList<>();
        ArrayList<Integer> moves = new ArrayList<>();
        
    }
    public static ArrayList<Integer> searchMoves(int idx, int move, ArrayList<Integer> dist, ArrayList<Integer> moves){
        int movesSum = 0;
        for (int i = 0; i < dist.size(); i++) {
            movesSum += dist.get(i);
        }
        if (idx == dist.size()) return moves;        
        else if(movesSum < 0) {
            moves.add(1001);
            return moves;
        }
        else{
            ArrayList<Integer> moveUp = moves;
            moveUp.add(dist.get(idx));
            ArrayList<Integer> moveDown = moves;
            moveDown.add((dist.get(dist.size() - 1) * -1));
        }
    }
    
}
