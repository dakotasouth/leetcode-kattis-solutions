import java.util.*;

public class electricaloutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            int sum = 0;
            for(int j=0;j<k;j++) sum+=sc.nextInt();
            System.out.println(sum - k + 1);
        }
    }
}
