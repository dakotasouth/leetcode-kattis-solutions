import java.util.*;
public class jobexpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() > 0){
            sc.nextLine();
            System.out.println(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).filter(i -> i<0).sum() * (-1));
        }
        else System.out.println(0);
    }
}
