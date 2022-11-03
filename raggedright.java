import java.util.*;

public class raggedright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> para = new ArrayList<>();
        int max = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            /*
            if(line.equals("-1")){
                break;
            }
            */
            para.add(line);
            System.out.println(line.length());
            if(line.length() > max) max = line.length();                        
        }
        para.remove(para.size()-1);
        int score = 0;

        for(String i: para){
            score += Math.pow((max - i.length()), 2);
        }
        System.out.println(score);
    }
}
