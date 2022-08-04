package kattis;

import java.util.*;
import java.io.*;

public class TreeInsertion {
    public static class Node{
        int key;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
            right = null;
            left = null;
        }
    }
    public static class BinaryTree{
        Node root;
        int size;
        
        
        BinaryTree(){
            root = null;
        }
        void insert (int key){
            root = insertRec(root, key);
            size++;
        }
        Node insertRec(Node root, int key){
            if (root == null){
                root = new Node(key);
                return root;
            }
            if (key < root.key) root.left = insertRec(root.left, key);
            else if(key > root.key) root.right = insertRec(root.right, key);
            return root;
        }
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //taking each test case
        while(n != 0){ //while loop doesn't stop when n = 0
            BinaryTree tree1 = new BinaryTree();
            int[] arr = new int[n];
            
            long count = 0;
            //adding all test case numbers to array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //adding array to tree
            for (int i = 0; i < arr.length; i++) {
                tree1.insert(arr[i]);
            }
            
            //List of all permutations
            ArrayList<ArrayList<Integer>> permutes = permute(arr); //permute not working because size is always 0
            //System.out.println(permutes.size());
            
            //loop thru all permutations
            for (int i = 0; i < permutes.size(); i++) {
                
                BinaryTree tree2 = new BinaryTree();
                for (int j = 0; j < arr.length; j++) {
                    tree2.insert(permutes.get(i).get(j)); //make each permutation into a tree
                }
                if (sameTrees(tree1.root, tree2.root)) count++; //compare each new tree to the base tree
            }                                                   //and add 1 to the count if it is the same
            System.out.println(count); //print count and get next array length
            n = sc.nextInt();
        }
    }
    public static ArrayList<ArrayList<Integer>> permute(int[] arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        permuteRecursive(list, new ArrayList<>(), arr);
        return list;
    }
    public static void permuteRecursive(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> resultList, int[] arr){
        
    }
    public static boolean sameTrees(Node a, Node b){ //compares trees recursively
        if (a == null && b == null) return true;
        if (a != null && b != null){
            return (a.key == b.key 
                    && sameTrees(a.left, b.left)
                    && sameTrees(a.right, b.right));
        }
        return false;
    }
}
