package javalang.arrays.and.strings;

import java.util.HashMap;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erboteltwat";
        System.out.println(String.format("The string %s is a rotation of the string %s : %s",s2,s1,isRotation(s1,s2)));
    }
    private static boolean isRotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            System.out.println(s2+" is not a rotated permutation of "+s1);
            return false;
        }
        s2=s2.concat(s2);
        return isSubstring(s2,s1);
    }

    private static boolean isSubstring(String s1,String s2){
        return s1.contains(s2);
    }

}
