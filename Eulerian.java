package kattis;

import java.util.*;
import java.io.*;
class Pointer{
    int key;
    Queue<Pointer> next = new LinkedList<>();
    Queue<Pointer> copynext = new LinkedList<>();
}
public class Eulerian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Pointer[] verts = new Pointer[n];
        for (int i = 0; i < n; i++) {
            Pointer p = new Pointer();
            p.key = i;
            verts[i] = p;
        }
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            verts[a-1].next.add(verts[b-1]);
            verts[a-1].copynext.add(verts[b-1]);
        }
        boolean possible = true;
        Pointer p = verts[0];
        while(p.next.size() != 0){
            p = p.next.remove();
        }
        boolean trav = true;
        int start = -1;
        for (int i = 0; i < n; i++) {
            if(verts[i].next.size() != 0) {
                trav = false;
                start = i;
                break;
            }
        }
        if(trav) System.out.println("anywhere");
        else{
            p = verts[start];
            int end = 0;
            while(p.copynext.size() != 0){
                p = p.copynext.remove();
                end = p.key;
            }
            trav = true;
            for (int i = 0; i < n; i++) {
                if(verts[i].copynext.size() != 0) {
                    trav = false;
                    break;
                }
            }
            if(trav) System.out.println(start + " " + end);
            else System.out.println("no");
        }
    }
}
