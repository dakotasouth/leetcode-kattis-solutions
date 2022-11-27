import java.util.*;
public class rectanglessurrounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 0){
            int[][] points = new int[n][4];
            int[][] grid = new int[500][500];
            for(int i=0;i<n;i++){
                points[i][0] = sc.nextInt();
                points[i][1] = sc.nextInt();
                points[i][2] = sc.nextInt();
                points[i][3] = sc.nextInt();

                for(int j=points[i][0];j<points[i][2];j++){
                    for(int k=points[i][1];k<points[i][3];k++){
                        grid[j][k] = 1;
                    }
                }
            }
            int sum = 0;
            for(int i=0;i<500;i++){
                for(int j=0;j<500;j++){
                    sum += grid[i][j];
                }
            }
            System.out.println(sum);
            n = sc.nextInt();
        }
    }
}