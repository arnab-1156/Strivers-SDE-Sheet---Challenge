import java.io.*;
import java.util.* ;

public class SetMatrixZeroes {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    for(int k = 0; k < matrix.length; k++){
                        for(int l = 0; l < matrix[k].length; l++){
                            if((k == i || l == j) && matrix[k][l] != 0)
                                matrix[k][l] = -1;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
        }
    }

}