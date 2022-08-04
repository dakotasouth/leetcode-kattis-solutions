
import java.util.*;
import java.io.*;

public class Nikola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        
        int[][] dp = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            /*
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
*/
        }
        
        dp[0][0] = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                if(dp[i][j] == Integer.MAX_VALUE) continue;
                int small = j-i;
                int big = j+i+1;
                
                if(small >= 0 && dp[i][small] > dp[i][j] + cost[small]){
                    dp[i][small] = dp[i][j] + cost[small];
                }
                if(big < n && dp[i+1][big] > dp[i][j]+cost[big]){
                    dp[i+1][big] = dp[i][j] + cost[big];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, dp[i][n-1]);
        }
        System.out.println(min);
    }
}
