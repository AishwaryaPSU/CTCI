package javalang.arrays.and.strings;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] inputMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(inputMatrix);
        System.out.println();
        //printRotatedMatrix(inputMatrix);
        System.out.println();
        printRotatedMatrix180(inputMatrix);
    }
    private static void printMatrix(int[][] input){
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void printRotatedMatrix180(int[][] inputMatrix){
        for(int i=inputMatrix.length-1;i>=0;i--){
            for(int j=inputMatrix[i].length-1;j>=0;j--){
                System.out.print(inputMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void printRotatedMatrix(int[][] input){
        for(int i=0;i<input.length;i++){
            for(int j=input[i].length-1;j>=0;j--){
                System.out.print(input[j][i]+" ");
            }
            System.out.println();
        }
    }
}
