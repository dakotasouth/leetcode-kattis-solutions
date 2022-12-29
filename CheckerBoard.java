
import java.util.*;
import java.io.*;

public class CheckerBoard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        String[][] board = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            String[] line = sc.next().split(regex);
            for (int j = 0; j < n; j++) {
                //System.out.println(line[j]);
                board[i][j] = line[j];
            }
        }
        boolean correct = true;
        for (int i = 0; i < n; i++) {
            int wCount = 0;
            int bCount = 0;
            for (int j = 0; j < n; j++) {
                if (board[i][j].compareTo("W") == 0) {
                    bCount = 0;
                    wCount++;
                    if (wCount == 3) correct = false;
                }
                else if(board[i][j].compareTo("B") == 0) {
                    wCount = 0;
                    bCount++;
                    if (bCount == 3) correct = false;
                }
            }            
        }
        for (int i = 0; i < n; i++) {
            int wCount = 0;
            int bCount = 0;
            for (int j = 0; j < n; j++) {
                if (board[j][i].compareTo("W") == 0) {
                    bCount = 0;
                    wCount++;
                    if (wCount == 3) correct = false;
                }
                else if(board[j][i].compareTo("B") == 0) {
                    wCount = 0;
                    bCount++;
                    if (bCount == 3) correct = false;
                }
            }            
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(board[i][j].compareTo("W") == 0) count++;
            }
            if (count != n/2) correct = false;
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(board[j][i].compareTo("W") == 0) count++;
            }
            if (count != n/2) correct = false;
        }
        if (correct) System.out.println("1");
        else System.out.println("0");
        
    }
}
