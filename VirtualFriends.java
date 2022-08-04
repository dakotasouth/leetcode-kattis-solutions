package kattis;

import java.util.*;
import java.io.*;

public class VirtualFriends {
    static class Friend{
        String name;
        Set<Friend> friends = new HashSet<>();
        
        Friend(String name){
            this.name = name;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Friend> people = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int cons = sc.nextInt();
            for (int j = 0; j < cons; j++) {
                String one = sc.next();
                String two = sc.next();//System.out.println(one+" "+two);
                boolean connected = false;
                
                for (Friend f: people) {
                    if (one.compareTo(f.name) == 0){
                        boolean both = false;
                        Friend mutFriend = null;
                        for(Friend f2: people){
                            if (two.compareTo(f2.name) == 0){
                                mutFriend = f2;
                                both = true;
                            }
                        }
                        if(!both){
                            Friend newF = new Friend(two);
                            for(Friend ff: f.friends){
                                //System.out.println(ff.name);
                                ff.friends.add(newF);
                                newF.friends.add(ff);
                            }
                            f.friends.add(newF);
                            newF.friends.add(f);
                            connected = true;
                            people.add(newF);
                            System.out.println(f.friends.size()+1);
                            break; 
                        }else{
                            for(Friend ff: f.friends){
                                ff.friends.add(mutFriend);
                                mutFriend.friends.add(ff);
                                ff.friends.addAll(mutFriend.friends);
                                mutFriend.friends.addAll(ff.friends);
                                                                
                            }
                            f.friends.addAll(mutFriend.friends);
                            mutFriend.friends.addAll(f.friends);
                            f.friends.add(mutFriend);
                            mutFriend.friends.add(f);
                            
                            connected = true;
                            System.out.println(f.friends.size()+1);
                            break;
                        }
                        
                    }
                    if (two.compareTo(f.name) == 0){
                        boolean both = false;
                        Friend mutFriend = null;
                        for(Friend f2: people){
                            if (one.compareTo(f2.name) == 0){
                                mutFriend = f2;
                                both = true;
                            }
                        }
                        if(!both){
                            Friend newF = new Friend(one);
                            for(Friend ff: f.friends){
                                //System.out.println(ff.name);
                                ff.friends.add(newF);
                                newF.friends.add(ff);
                            }
                            f.friends.add(newF);
                            newF.friends.add(f);
                            connected = true;
                            people.add(newF);
                            System.out.println(f.friends.size()+1);
                            break; 
                        }else{
                            for(Friend ff: f.friends){
                                ff.friends.add(mutFriend);
                                mutFriend.friends.add(ff);
                                ff.friends.addAll(mutFriend.friends);
                                mutFriend.friends.addAll(ff.friends); 
                            }
                            f.friends.addAll(mutFriend.friends);
                            mutFriend.friends.addAll(f.friends);
                            f.friends.add(mutFriend);
                            mutFriend.friends.add(f);
                            
                            connected = true;
                            System.out.println(f.friends.size()+1);
                            break;
                        }
                    }
                }
                if(!connected){
                    Friend fOne = new Friend(one);
                    Friend fTwo = new Friend(two);
                    fOne.friends.add(fTwo);
                    fTwo.friends.add(fOne);
                    people.add(fOne);
                    people.add(fTwo);
                    System.out.println(2);
                } 
            }
        }
    }
}
