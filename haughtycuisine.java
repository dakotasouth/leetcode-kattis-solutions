import java.util.*;

public class haughtycuisine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String[] line = sc.nextLine().split(" ");
            if(i == n-1){
                for(int j=0;j<line.length;j++){
                    System.out.println(line[j]);
                }
            }
        }
    }
}
