import java.util.*;

public class moderatepace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dayDist = new int[3][n];

        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                dayDist[i][j] = sc.nextInt();
                //System.out.print(dayDist[i][j]);
            }
        }

        for(int i=0;i<n;i++){
            int[] today = new int[3];
            today[0] = dayDist[0][i];
            today[1] = dayDist[1][i];
            today[2] = dayDist[2][i];

            Arrays.sort(today);
            System.out.print(today[1] + " ");
        }
        
    }    
}
