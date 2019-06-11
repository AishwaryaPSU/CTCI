package javalang.arrays.and.strings;

public class OneAway {
    private static int nAway=1;
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ale";
        boolean result = isNAway(str1,str2);
        if(result){
            System.out.println("true");
        }else System.out.println("false");
    }

    private static boolean isNAway(String str1, String str2){
        int countEdit=0;
        int i=0;
        int j=0;
        while(i<str1.length()&&j<str2.length()){
            if(str1.charAt(i)!=str2.charAt(j)){
                countEdit++;
                if(str1.length()>str2.length()){
                    i++;
                }else if(str1.length()<str2.length()){
                    j++;
                }
            }else {
                    j++;
                    i++;
            }
            if(countEdit>nAway)return false;
        }
        System.out.println("Edit length is = "+countEdit);
        return true;
    }
}
