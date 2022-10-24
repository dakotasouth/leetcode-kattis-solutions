import java.util.*;

public class fyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        if(num.substring(0,3).equals("555")) System.out.println(1);
        else System.out.println(0);
    }
}
