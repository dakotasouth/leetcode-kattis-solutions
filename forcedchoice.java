import java.util.*;
public class forcedchoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int s = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<s;i++){
            int x = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<x;j++) list.add(sc.nextInt());
            if(list.contains(p)){
                System.out.println("KEEP");
            }
            else System.out.println("REMOVE");
        }
    }
}