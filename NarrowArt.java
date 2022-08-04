package kattis;

import java.util.*;
import java.io.*;


public class NarrowArt {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int closed = sc.nextInt();
        while (rows != 0 && closed != 0 && rows != -1){
            int sum = 0;
            ArrayList<Room> left = new ArrayList<>();
            ArrayList<Room> right = new ArrayList<>();
            for (int i = 0; i < rows; i++) { //add all rooms to left and right lists and find sum of total value
                Room leftR = new Room(sc.nextInt(), 0);
                Room rightR = new Room(sc.nextInt(), 1);
                left.add(leftR);
                right.add(rightR);
                sum+=leftR.value + rightR.value;
            }
            ArrayList<Room> closedRooms = new ArrayList<>();
            for (int i = 0; i < rows; i++) { //adding smallest value of each room to closedRooms
                if (left.get(i).value < right.get(i).value) {
                    left.get(i).closed = true;
                    right.get(i).closed = false;
                    closedRooms.add(left.get(i));
                }
                else if(right.get(i).value < left.get(i).value) {
                    right.get(i).closed = true;
                    left.get(i).closed = false;
                    closedRooms.add(right.get(i));
                }else{
                    if (closedRooms.get(closedRooms.size()-1).side == 0){
                        left.get(i).closed = true;
                        right.get(i).closed = false;
                        closedRooms.add(left.get(i));
                    }else if(closedRooms.get(closedRooms.size()-1).side == 1){
                        right.get(i).closed = true;
                        left.get(i).closed = false;
                        closedRooms.add(right.get(i));
                    }
                }
            }
            for (int i = 0; i < rows; i++) { //setting diagonals
                if(i == 0){                    
                    left.get(i).diagDown = right.get(i+1);                    
                    right.get(i).diagDown = left.get(i+1);
                }else if(i == rows-1){
                    left.get(i).diagUp = right.get(i-1);
                    right.get(i).diagUp = left.get(i-1);
                }else {
                    left.get(i).diagUp = right.get(i-1);
                    left.get(i).diagDown = right.get(i+1);
                    right.get(i).diagUp = left.get(i-1);
                    right.get(i).diagDown = left.get(i+1);
                }
            }
            //System.out.println(right.get(0).closed);
            int count = 0;
            /*
            for (int i = 0; i < rows; i++) {
                System.out.println(closedRooms.get(i).value);
            }
            */
            
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < rows; j++) {
                    if (count < closed){
                        if(closedRooms.get(j).value == i && closedRooms.get(j).hasOpened == false){
                            count++;
                            Room currRoom = closedRooms.get(j);
                            sum -= currRoom.value;
                            System.out.println("currRoom: "+currRoom.value +" "+ j + " " + currRoom.side);
                            //System.out.println("");
                            if(j == 0){
                                if(currRoom.diagDown.closed == true){
                                    System.out.println("opening: "+ currRoom.diagDown.value + " " + (j+1));
                                    currRoom.diagDown.closed = false;
                                    currRoom.diagDown.hasOpened = true;
                                    if (currRoom.side == 0){
                                        if (left.get(j+1).hasOpened == false){//
                                            System.out.println("closing: "+left.get(j+1).value + " " + (j+1));
                                            left.get(j+1).closed = true;//
                                        }else left.get(j+1).value = -1;
                                        closedRooms.set(j+1, left.get(j+1));//
                                }else {
                                    if(right.get(j+1).hasOpened == false){//
                                        System.out.println("closing: "+ right.get(j+1).value + " " + (j+1));
                                        right.get(j+1).closed = true;//
                                    }else right.get(j+1).value = -1;
                                    closedRooms.set(j+1, right.get(j+1));//
                                }
                                }
                            }
                            else if(j == rows-1){
                                if(currRoom.diagUp.closed == true){
                                    //open room, close adjacent, replace in closedRooms list
                                    System.out.println("opening: "+currRoom.diagUp.value + " " + (j-1));
                                    currRoom.diagUp.closed = false;
                                    currRoom.diagUp.hasOpened = true;
                                    if (currRoom.side == 0){
                                        if(left.get(j-1).hasOpened == false){//
                                            left.get(j-1).closed = true;//
                                            System.out.println("closing: "+ left.get(j-1).value + " " + (j-1));
                                        }else left.get(j-1).value = -1;
                                        closedRooms.set(j-1, left.get(j-1));//
                                    }else {
                                        if(right.get(j-1).hasOpened == false){//
                                            right.get(j-1).closed = true;//
                                            System.out.println("closing: "+right.get(j-1).value + " " + (j-1));
                                        }else right.get(j-1).value = -1;
                                        closedRooms.set(j-1, right.get(j-1));//
                                    }                            
                                }
                            }
                            
                            else{
                                
                                if(currRoom.diagUp.closed == true){
                                    //open room, close adjacent, replace in closedRooms list
                                    currRoom.diagUp.closed = false;
                                    System.out.println("opening: "+ currRoom.diagUp.value + " " + (j-1));
                                    currRoom.diagUp.hasOpened = true;
                                    if (currRoom.side == 0){
                                        if(left.get(j-1).hasOpened == false){//
                                            left.get(j-1).closed = true;//
                                            System.out.println("closing: "+left.get(j-1).value + " " + (j-1));
                                        }else left.get(j-1).value = -1;
                                        closedRooms.set(j-1, left.get(j-1));//
                                        System.out.println(closedRooms.get(j-1).value);
                                    }else {
                                        if(right.get(j-1).hasOpened == false){//
                                            right.get(j-1).closed = true;//
                                            System.out.println("closing: "+right.get(j-1).value + " " + (j-1));
                                        }else right.get(j-1).value = -1;
                                        closedRooms.set(j-1, right.get(j-1));//
                                    }                            
                                }
                                if(currRoom.diagDown.closed == true){
                                    currRoom.diagDown.closed = false;
                                    System.out.println("opening: "+currRoom.diagDown.value + " " + (j+1));
                                    currRoom.diagDown.hasOpened = true;
                                    if (currRoom.side == 0){
                                        if (left.get(j+1).hasOpened == false){//
                                            left.get(j+1).closed = true;//
                                            System.out.println("closing: " + left.get(j+1).value + " " + (j+1));
                                        }else left.get(j+1).value = -1;
                                        closedRooms.set(j+1, left.get(j+1));//
                                    }else {
                                        if(right.get(j+1).hasOpened == false){//
                                            right.get(j+1).closed = true;//
                                            System.out.println("closing: "+right.get(j+1).value + " " + (j+1));
                                        }else left.get(j+1).value = -1;
                                        closedRooms.set(j+1, right.get(j+1));//
                                    }
                                } 
                            }                            
                        }
                    }else break;
                }
            }
            /*
            for (int i = 0; i < rows; i++) {
                System.out.println(closedRooms.get(i).value);
            }
            */
            System.out.println(sum);
            rows = sc.nextInt();
            closed = sc.nextInt();
            
        }
    }
}
class Room{
    int value;
    int side;
    Room diagUp;
    Room diagDown;
    boolean closed = false;
    boolean hasOpened = false;
    
    Room(int value, int side){
        this.value = value;
        this.side = side;
    }
    
}
