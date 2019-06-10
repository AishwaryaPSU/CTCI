package javalang.arrays.and.strings;

public class URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith      ";
        String newinput =input.trim();
        char array[] = input.toCharArray();
        int j=0;
        for(int i=0;i<input.length();i++){
            if(j==newinput.length())break;
            if(newinput.charAt(j)!=' '){
                    array[i]=newinput.charAt(j);
                    j++;
                    continue;
                }
                array[i]='%';
                array[i+1]='2';
                array[i+2]='0';
                i=i+2;
                j++;
        }
        System.out.println(new String(array));
    }
}
