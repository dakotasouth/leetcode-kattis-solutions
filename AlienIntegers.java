import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class AlienIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
       
        String[] sNum = String.valueOf(n).split("");
        //System.out.println(sNum.length);
        int[] num = new int[sNum.length];
        for (int i = 0; i < sNum.length; i++) {
            num[i] = Integer.valueOf(sNum[i]);
        }
        //System.out.println(num.length);
        ArrayList<Integer> leftOver = new ArrayList<>();
        leftOver.add(0);
        leftOver.add(1);
        leftOver.add(2);
        leftOver.add(3);
        leftOver.add(4);
        leftOver.add(5);
        leftOver.add(6);
        leftOver.add(7);
        leftOver.add(8);
        leftOver.add(9);
       
        for(int i: num){
            if(!leftOver.isEmpty() && leftOver.contains(i)){
                leftOver.remove(leftOver.indexOf(i));
            }    
        }
       
        //System.out.println();
        /*
        for(Integer i: leftOver){
            System.out.println(i);
        }
        */
        int[] lowAns = new int[num.length];
        int[] highAns = new int[num.length];
        if(!leftOver.isEmpty()){
            for (int i = leftOver.size()-1; i >= 0; i--) {
                if(leftOver.get(i) < num[0]){
                    lowAns[0] = leftOver.get(i);
                    break;
                }
            }
            for (int i = 1; i < lowAns.length; i++) {
                lowAns[i] = leftOver.get(leftOver.size()-1);
            }
            /*
            for (int i = 0; i < lowAns.length; i++) {
                System.out.print(lowAns[i]);
            }
            System.out.println();
            */
            if(num[0] > leftOver.get(leftOver.size() - 1)){
                highAns = new int[num.length + 1];
               
                if(leftOver.get(0) != 0){
                    highAns[0] = leftOver.get(0);
                }
                else if(leftOver.get(0) == 0 && leftOver.size() > 1) highAns[0] = leftOver.get(1);
                else highAns[0] = 0;
               
            }
            else{
                for (int i = 0; i < leftOver.size(); i++) {
                    if(leftOver.get(i) > num[0]){
                        highAns[0] = leftOver.get(i);
                        break;
                    }
                }
            }
            for (int i = 1; i < highAns.length; i++) {
                highAns[i] = leftOver.get(0);
            }
            /*
            for (int i: highAns) {
                System.out.print(i);
            }
            System.out.println();
            */
            String h = "";
            String l = "";
           
            for (int i = 0; i < highAns.length; i++) {
                h += String.valueOf(highAns[i]);
            }
            for (int i = 0; i < lowAns.length; i++) {
                l += String.valueOf(lowAns[i]);
            }
           
            long low = Long.valueOf(l);
            long high = Long.valueOf(h);
           
            if((high - n) < (n - low)) System.out.println(high);
            else if(((high - n) > (n - low))) System.out.println(low);
            else System.out.println(low + " " + high);
        }
        else System.out.println("Impossible");
       
    }
}
