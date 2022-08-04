package kattis;

import java.util.*;
import java.io.*;

public class MoneyMatters2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int ships = sc.nextInt();
        ArrayList<Persons> people = new ArrayList<>();
        for (int i = 0; i < friends; i++) {
            Persons p1 = new Persons(i, sc.nextInt());
            people.add(p1);
        }        
        for (int i = 0; i < ships; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            people.get(p1).friends.add(people.get(p2));
            people.get(p2).friends.add(people.get(p1));
        }
        for (Persons p: people) {            
            p.findFriends();
            //for(Persons p2: p.friends) System.out.print(p2.num);
            //System.out.println();
        }
        int count = 0;
        for (Persons p: people) {  
            count++;
            int sum = p.debt;
            for (Persons p2: p.friends) sum += p2.debt;
            if (sum != 0) {
                System.out.println("IMPOSSIBLE");
                break;
            }
            if (count == friends) System.out.println("POSSIBLE");
        }                
    }
}
class Persons{
    int debt;
    int num;
    Set<Persons> friends = new HashSet<>();
    
    Persons(int num, int debt){
        this.num = num;
        this.debt = debt;
        
    }
    public void findFriends(){
        for(Persons f1: friends){
            for (Persons f2: f1.friends) {
                if (f2.num != this.num){
                    this.friends.add(f2);
                    //f2.friends.add(this);
                }
            }
        }
    }
}
