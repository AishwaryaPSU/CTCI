package javalang.arrays.and.strings;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] inputMatrix = {{1,4,0},{2,0,9},{5,9,8},{2,2,2}};
        int[][] result = Arrays.copyOf(inputMatrix,inputMatrix.length);
                //new int[inputMatrix.length][inputMatrix[0].length];
//        for(int i=0;i<inputMatrix.length;i++){
//            for(int j=0;j<inputMatrix[i].length;j++){
//                result[i][j]=inputMatrix[i][j];
//            }
//        }
        printMartix(inputMatrix);
        System.out.println();

        for(int i=0;i<inputMatrix.length;i++){
            for(int j=0;j<inputMatrix[i].length;j++){
                if(inputMatrix[i][j]==0){
                    setToZero(i,j,inputMatrix,result);
                }
                //else result[i][j]=inputMatrix[i][j];
            }
        }
        printMartix(result);
    }
    private static void printMartix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
//                if(matrix[i][j]==Integer.MIN_VALUE)
//                {
//                    matrix[i][j]=0;
//                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void setToZero(int i,int j,int[][] input,int[][] result){
        for(int k=0;k<input[i].length;k++){
            //input[i][k]=Integer.MIN_VALUE;
            result[i][k]=0;
        }
        for(int k=0;k<input.length;k++){
            //input[k][j]=Integer.MIN_VALUE;
            result[k][j]=0;
        }
    }
}
