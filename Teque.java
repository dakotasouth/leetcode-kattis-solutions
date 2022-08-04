package kattis;

import java.util.*;
import java.io.*;

public class Teque {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> topDeque = new ArrayDeque<>();
        Deque<Integer> bottomDeque = new ArrayDeque<>();
        
        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            evenLists(bottomDeque, topDeque);
            System.out.print(bottomDeque.toString()+topDeque.toString()+" ");
            String[] line = sc.nextLine().split(" ");
            //for(String lin:line) System.out.print(lin+" ");
            if(line[0].compareTo("push_back") == 0){
                topDeque.addLast(Integer.parseInt(line[1]));
                System.out.println("pushb");
            }
            else if(line[0].compareTo("push_front") == 0){
                bottomDeque.addFirst(Integer.parseInt(line[1]));
                System.out.println("pushf");
            }
            else if(line[0].compareTo("push_middle") == 0){
                bottomDeque.addLast(Integer.parseInt(line[1]));
                System.out.println("pushm");
            }
            else if(line[0].compareTo("get") == 0){
                System.out.print("got ");
                if (Integer.parseInt(line[1]) <= bottomDeque.size()-1){
                    int idx = 0;
                    for(Integer num: bottomDeque){
                        if (idx == Integer.parseInt(line[1])) {
                            System.out.println(num);
                            break;
                        }idx++;
                    }
                }
                else if(Integer.parseInt(line[1]) > bottomDeque.size()-1){
                    int getIdx = Integer.parseInt(line[1]) - bottomDeque.size()-1;
                    int idx = 0;
                    for(Integer num: topDeque){
                        if (idx == getIdx) {
                            System.out.println(num);
                            break;
                        }idx++;
                    }
                }
            }
        }
    }
    public static void evenLists(Deque<Integer> one,Deque<Integer> two){        
        while(true){    
            if(one.size() > two.size()){
                two.addFirst(one.removeLast());
            }
            else break;
        }
    }
}
