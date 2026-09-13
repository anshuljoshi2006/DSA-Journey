import java.util.*;
public class spiralmatrix{
    public static void spiral(int matrix[][]){
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;

        while(sr<=er && sc<=ec){
            for(int i=sc ; i<=ec ; i++){
                System.out.print(matrix[sr][i] + " ");
            }
            
            for(int j=sr+1 ; j<=er ; j++){
                System.out.print(matrix[j][ec] + " ");
            }

            for(int k=ec-1 ; k>=sc ; k--){
                if(sr==er){
                    break;
                }
                System.out.print(matrix[er][k] + " ");
            }

            for(int p=er-1 ; p>sr ; p--){
                if(sc == ec){
                    break;
                }
                System.out.print(matrix[p][sc] + " ");
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,4,15,16}} ;
        spiral(matrix);
    }
}