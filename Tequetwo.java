package kattis;

import java.util.*;
import java.io.*;

public class Tequetwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> teque = new ArrayDeque<>();       
        
        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            //System.out.print(teque.toString());
            String[] line = sc.nextLine().split(" ");
            if(line[0].compareTo("push_back") == 0){
                teque.addLast(Integer.parseInt(line[1]));
                //System.out.println("pushb");
            }
            else if(line[0].compareTo("push_front") == 0){
                teque.addFirst(Integer.parseInt(line[1]));
                //System.out.println("pushf");
            }
            else if(line[0].compareTo("push_middle") == 0){
                int idx = 0;
                int[] bottom = new int[(teque.size()+1)/2 + 1];
                int[] top = new int[(teque.size()+1)/2];
                for(Integer num: teque){
                    //System.out.print(num+" ");
                    if(idx < bottom.length - 1) {
                        bottom[idx] = num;                        
                        idx++;
                    }else if(idx == (teque.size()+1)/2){
                        bottom[idx] = Integer.parseInt(line[1]);
                        idx++;
                        top[idx-bottom.length] = num;
                        idx++;
                    }else if(idx > bottom.length - 1) {
                        top[idx - bottom.length] = num;
                        idx++;
                    }
                }
                //System.out.println(Arrays.toString(bottom)+Arrays.toString(top));
                int len = teque.size();
                teque.clear();
                for (int j = 0; j < len+1; j++) {
                    if(j <= bottom.length-1) teque.add(bottom[j]);
                    else if(j >= bottom.length){
                        teque.add(top[j-bottom.length]);
                    }
                }
                //System.out.println("pushm");
            }
            else if(line[0].compareTo("get") == 0){
                //System.out.print(teque.toString()+" got ");
                int idx = 0;
                for(Integer num: teque){
                    if(idx == Integer.parseInt(line[1])){
                        System.out.println(num);
                        idx++;
                    }else idx++;
                }
            }
        }
    }
    
}
