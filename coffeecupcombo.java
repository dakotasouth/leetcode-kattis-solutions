import java.util.*;

public class coffeecupcombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        String[] lects = sc.nextLine().split("");

        int awake = 0;
        int coffees = 0;
        for(int i=0;i<n;i++){
            if(lects[i].compareTo("0") == 0 && coffees > 0){
                awake++;
                coffees--;
            }
            else if(lects[i].compareTo("1") == 0){
                coffees = 2;
                awake++;
            }
        }
        System.out.println(awake);
    }
}
