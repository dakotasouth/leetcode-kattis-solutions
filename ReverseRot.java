
package kattis;
import java.util.*;
public class ReverseRot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","_","."};
        int n = sc.nextInt();
        //goes through each line until 0
        while (n != 0){
            String line = sc.next();
            //change the string to char array and add to arraylist
            char[] arr = line.toCharArray();
            ArrayList<Character> list = new ArrayList();
            for(char x: arr) list.add(x);
            //reverse the list
            Collections.reverse(list);
            //find each character in the alphabet array and change it by +n letters
            for(int i=0;i<list.size();i++) {
                //System.out.println(list.get(i));
                for(int j=0;j<alpha.length;j++){
                    if(alpha[j].charAt(0) == list.get(i)) {
                        // if the letter change is out of bounds it wraps around to start of alpha
                        if(j+n > alpha.length-1){
                            list.set(i, alpha[(j+n)-alpha.length].charAt(0));
                            break;
                        }else{
                            list.set(i, alpha[j+n].charAt(0));
                            break;
                        }
                    }
                }
            }for(char c: list) System.out.print(c);
            System.out.println();
            n = sc.nextInt();
        }
    }
}
