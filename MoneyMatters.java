package kattis;

import java.util.*;
import java.io.*;
public class MoneyMatters {
    static Person[] people;
    static LinkedList<Integer> q = new LinkedList<>();
    static boolean[] seen;
    
    public static class Person{
        int debt;
        
        Set<Integer> friends = new HashSet<>();

        Person(int debt){
            
            this.debt = debt;

        }    
    }
    public static int search(int sum, int idx){
        Person curr = people[idx];
        for(int i:curr.friends){
            if(!seen[i]){
                seen[i] = true;
                q.add(i);
            }
        }
        if(q.isEmpty()) return sum;
        int next = q.pop();
        return search(people[next].debt+sum,next);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int ships = sc.nextInt();
        
        people = new Person[friends];
        seen = new boolean[friends];
        
        for (int i = 0; i < seen.length; i++) {
            seen[i] = false;
        }
        
        for (int i = 0; i < friends; i++) {
            Person p1 = new Person(sc.nextInt());
            people[i] = p1;
        }
        for (int i = 0; i < ships; i++) {
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();
            people[f1].friends.add(f2);
            people[f2].friends.add(f1);
        }
        boolean poss = true;
        
        for (int i = 0; i < people.length; i++) {
            if (search(0,i) != 0) poss = false;
        }
        
        if (poss) System.out.println("POSSIBLE");
        else System.out.println("IMPOSSIBLE");
                        
    }
}

