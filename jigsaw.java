import java.util.*;
public class jigsaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int e = sc.nextInt();
        int m = sc.nextInt();

        int area = c+e+m;
        int w = 0; int h = 0;
        if(c == 4 && e % 2==0){
            for(int i=0;i<=e/4;i++){
                if((i+2) * ((e/2)-i+2) == area){
                    w = i+2; h = (e/2)-i+2;
                    break;
                }
            }
        }
        if(c == 4 && e == 0 && m == 0){
            w = 2; h = 2;
        }
        if(w==0)System.out.println("impossible");
        else System.out.println(w + " " + h);
    }
}
