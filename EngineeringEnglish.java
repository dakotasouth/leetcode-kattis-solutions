 
import java.util.*;
import java.io.*;

public class EngineeringEnglish {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> text = new HashSet<>();
        //ArrayList<String> line = new ArrayList<>();
        while(sc.hasNext()){
            String[] words = sc.nextLine().split(" ");
            for (int i = 0; i < words.length; i++) {
                if(text.add(words[i].toLowerCase())) System.out.print(words[i]+ " ");
                else System.out.print(". ");
            }
            
        }
    }
}
