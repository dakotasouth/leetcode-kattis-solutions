import java.util.*;

public class organfreeman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int n = y;
        int[] factorials = new int[10];
        
        factorials[0] = 1;

        List<Integer> arr = new ArrayList<>();
        for(int i=9; i>0; i--) {
            while(factorials[i]<=n){
                n-= factorials[i]; arr.add(i);
            }
        }
        Collections.reverse(arr);
        for(int i:arr) System.out.println(i);
    }    
}

/*
 * int [] fact = new int[10];

    fact[0] = 1;

    for(int i=1; i<10; i++) fact[i] = i*fact[i-1];

    ArrayList<Integer> arr = new ArrayList<>();

    int n = sc.nextInt();

    if(n==1){ System.out.println("0"); return; }



    for(int i=9; i>0; i--) while(fact[i]<=n){

        n-= fact[i]; arr.add(i);

    }

    Collections.reverse(arr);

    for(int i: arr) System.out.print(i);
 * 
 */