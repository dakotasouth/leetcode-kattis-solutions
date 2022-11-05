import java.util.*;
public class greetingstwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextLine().length() - 2;
        System.out.print("h");
        for(int i=0;i<len*2;i++) System.out.print("e");
        System.out.println("y");
    }
}
