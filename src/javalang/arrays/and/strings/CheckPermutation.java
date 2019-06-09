package javalang.arrays.and.strings;

import java.util.HashMap;

public class CheckPermutation {
    public static void main(String[] args) {
        String a="asd";
        String b="asa";
        boolean isPermutation=false;
        if(a.length()!=b.length()) {
            System.out.println(isPermutation);
        }else {
            isPermutation=(isPermutation(a,b));
            System.out.println(isPermutation);
        }
    }
    private static boolean isPermutation(String a,String b){
        HashMap<Character,Integer> hashA = new HashMap<>();
        HashMap<Character,Integer> hashB = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(hashA.containsKey(a.charAt(i))){
                hashA.put(a.charAt(i),hashA.get(a.charAt(i))+1);
                continue;
            }
            hashA.put(a.charAt(i),1);
        }
        for(int i=0;i<b.length();i++){
            if(hashB.containsKey(b.charAt(i))){
                hashB.put(b.charAt(i),hashB.get(b.charAt(i))+1);
                continue;
            }
            hashB.put(b.charAt(i),1);
        }
        return hashA.equals(hashB);
    }
}
