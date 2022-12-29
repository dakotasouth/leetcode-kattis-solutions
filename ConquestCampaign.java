
import java.util.*;
import java.io.*;

public class ConquestCampaign {
    public static class Vx {
        int r, c;
        int dis, color;
        Vx(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int n = sc.nextInt();
        Queue<Vx> q = new LinkedList<>();
        Vx[][] grid = new Vx[rows+1][cols+1];
        for (int r = 1; r < rows+1; r++) {
            for (int c = 1; c < cols+1; c++) {
                grid[r][c] = new Vx(r, c);
            }
        }
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            grid[x][y].color = 1;
            grid[x][y].dis = 0;
            q.add(grid[x][y]);
        }
        
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int max = 0;
        while (!q.isEmpty()){
            Vx u = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = dx[i] + u.r;
                int y = dy[i] + u.c;
                if (x < rows+1 && y < cols+1 && x > 0 && y > 0 && grid[x][y].color == 0){
                    grid[x][y].color = 1;
                    grid[x][y].dis = u.dis + 1;
                    q.add(grid[x][y]);
                    if (grid[x][y].dis > max) max = grid[x][y].dis;
                }
            }
            u.color = 2;
        }
        System.out.println(max + 1);
    }
}
