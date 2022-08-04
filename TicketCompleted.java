package kattis;

import java.util.*;
import java.io.*;

class City{
    int val;
    ArrayList<City> nbrs = new ArrayList<>();    
    int subNbrs = 0;
    boolean seen = false;
   
    City(int val, City nbr){
        this.val = val;
        nbrs.add(nbr);
    }
    City(int val){
        this.val = val;
    }
}

public class TicketCompleted {
    static int railCount(City city){
        city.seen = true;
        //System.out.println("nbrCount: " + city.nbrCt);
        int count = 0; //count is all nodes below nbrs
        //never going to get this
        if(city.nbrs.isEmpty()){
            return 0;
        }
        for(City nbr: city.nbrs){
            if(!nbr.seen){    
                count += railCount(nbr);
            }
            else {
                count--; //this is a nbr and we cant change nbr.size so offset count by -1
            }
        }
        System.out.println(city.val+ ": "+ city.nbrs.size() + " + " + count);
        city.subNbrs = count; //save value
        return city.nbrs.size() + count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        City[] rails = new City[n+1];
       
        //adds all nodes to list and nbr lists
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            if(rails[a] == null && rails[b] == null){
                rails[b] = new City(b);
                rails[a] = new City(a,rails[b]);
                rails[b].nbrs.add(rails[a]);
            }
            else if(rails[a] != null && rails[b] == null){
                rails[b] = new City(b);
                rails[a].nbrs.add(rails[b]);
                rails[b].nbrs.add(rails[a]);
            }
            else if(rails[a] == null && rails[b] != null){
                rails[a] = new City(a, rails[b]);
                rails[b].nbrs.add(rails[a]);
            }
            else if(rails[a] != null && rails[b] != null){
                rails[a].nbrs.add(rails[b]);
                rails[b].nbrs.add(rails[a]);
            }
        }
        double count = 0;
        for(int i=1; i<n+1; i++){
            if(rails[i] != null){
                if(!rails[i].seen) {
                    count += railCount(rails[i]);
                    System.out.println("count: " + count);
                }
                else { //already did dfs so just get value
                    count += rails[i].nbrs.size() + rails[i].subNbrs;
                    System.out.println(i + " count: " + count);
                }
            }
        }
        double tot = (n*(n-1))/2;
        System.out.println(count + " / " + tot);
        System.out.println(count / tot);
    }
}
//Test case
/*
8 8
1 6
2 3
2 4
4 5
5 6
5 7
6 8
7 6
*/
//Test case
/*
4 4
1 2
2 3
3 4
4 2
*/

/*
3 2
1 2
2 3
*/

/*
6 3
1 2
3 4
5 6
*/

/*
8 4
1 2
2 3
2 4
4 7
*/

/*
8 5
1 2
1 3
1 4
2 4
2 3
*/
