import java.util.*;

public class organfreeman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        int[] factorials = new int[10];
        factorials[0] = 1;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            factorials[i] = factorials[i-1]*i;
        }

        for(int i=0;i<Integer.MAX_VALUE;i++){
            if(i<10){
                if(factorials[i] == y) {
                    System.out.println(i);
                    break;
                }
            }
            else{
                if()
            }
        }

    }
}
