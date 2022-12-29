import java.util.*;

public class coffecupcombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine();
        int[] lectures = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        int coffees = 0;
        int awake = 0;
        for(int i=0;i<n;i++){
            if(lectures[i] == 1) {
                coffees=2;
                awake++;
            }
            else if(lectures[i] == 0 && coffees > 0){
                coffees--;
                awake++;
            }
        }
        System.out.println(awake);
    }
}
