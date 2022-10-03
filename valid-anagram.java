import java.util.*;

class Solution {
    public static boolean isAnagram(String s, String t) {
        String[] sarr = s.split("");
        String[] tarr = s.split("");

        Arrays.sort(sarr); Arrays.sort(tarr);
        if(sarr == tarr) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
