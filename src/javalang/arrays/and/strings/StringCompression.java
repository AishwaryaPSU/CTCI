package javalang.arrays.and.strings;

public class StringCompression {
    public static void main(String[] args) {
        String input = "AAAAabccccca";
        System.out.println(compress(input));
    }
    private static String compress(String input){
        int count=1;
        String output="";
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }else{
                output=output.concat(String.valueOf(input.charAt(i-1))+count);
                count=1;
            }
        }
            output=output.concat(String.valueOf(input.charAt(input.length()-1))+count);

        if (output.length()>=input.length())
            return input;
        return output;
    }
}
