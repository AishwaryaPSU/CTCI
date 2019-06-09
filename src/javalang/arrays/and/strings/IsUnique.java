package javalang.arrays.and.strings;

import java.util.HashMap;

public class IsUnique {
    public static void main(String[] args) {
        String s="elephant";
        s=s.toLowerCase();
        boolean isUnique=isUnique(s)&&isUniqueUsingHM(s);
        System.out.println(isUnique);
    }
    //Brute Force - O(n^2)
    private static boolean isUnique(String s){
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    //using additional Data structure - O(n)
    private static boolean isUniqueUsingHM(String s){
        HashMap<Character,Integer> hash = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i)))return false;
            hash.put(s.charAt(i),1);
        }
        return true;
    }
}
