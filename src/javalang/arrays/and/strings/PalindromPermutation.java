package javalang.arrays.and.strings;

import java.util.HashSet;

public class PalindromPermutation {
    public static void main(String[] args) {
        String input ="damma";
        input=input.replaceAll(" ","").toLowerCase();
        boolean result = isPalindromePermutation(input);
        System.out.println(String.format("The given string %s is a permutation of a palindrome %s.",input,result));

    }
    private static boolean isPalindromePermutation(String input){
        HashSet<Character> hash = new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' ')continue;
            if(!hash.contains(input.charAt(i))){
                hash.add(input.charAt(i));
            }else {
                hash.remove(input.charAt(i));
            }
        }
//        if(input.length()%2==0&&hash.isEmpty()||input.length()%2==1&&hash.size()==1) {
//            return true;
//        }
//        return false;
        return input.length()%2==0 ? hash.isEmpty():hash.size()==1;
    }
}
