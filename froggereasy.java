import java.util.*;

public class froggereasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt()-1;  
        int magic = sc.nextInt();

        int[] board = new int[n];
        boolean[] seen = new boolean[n]; 

        for(int i=0;i<n;i++){
            board[i] = sc.nextInt();
        }
        
        int hops = 0;
        int curr = start + board[start];
        seen[start] = true;
        boolean over = false;
        
        if(board[start] == magic){
            System.out.println("magic");
            System.out.println(hops);
            over = true;
        }
        if(board[start] == 0){
            System.out.println("cycle");
            System.out.println(hops);
            over = true;
        }
        while (!over){
            //System.out.println(curr);
            if(curr >= n){
                hops++;
                System.out.println("right");
                System.out.println(hops);
                over = true;
            }
            else if(curr < 0){
                hops++;
                System.out.println("left");
                System.out.println(hops);
                over = true;
            }
            else if(seen[curr]){
                hops++;
                System.out.println("cycle");
                System.out.println(hops);
                over = true;
            }
            else if(board[curr] == magic){
                hops++;
                System.out.println("magic");
                System.out.println(hops);
                over = true;
            }
            else{
                hops++;
                seen[curr] = true;
                curr = curr + board[curr];
            }
            
        }
    }
}
