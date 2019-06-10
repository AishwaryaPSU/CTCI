package javalang.arrays.and.strings;

public class URLifyInPlace {
    public static void main(String[] args) {
        String input = "Mr John Smith      ";
        char[] array = input.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]==' ') {
                move(array,i);
                move(array,i);
                array[i]='%';
                array[i+1]='2';
                array[i+2]='0';
                i=i+2;
            }
        }
        System.out.println(String.format("Result String = %s",new String(array)));
    }
    private static void move(char[] array,int i){
        for(int j=array.length-1;j>i;j--){
            array[j]=array[j-1];
        }
    }
}
