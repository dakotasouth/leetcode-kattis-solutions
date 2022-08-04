package kattis;
import java.util.*;
public class Kattis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int elements = 0;
        ArrayList<Character> chars = new ArrayList<Character>();
        for(char c: s.toCharArray()){
            chars.add(c);
            elements++;
        }for(int i=0;i<chars.size();i++){
            System.out.println(chars.get(i));
        }
    }
    
}
