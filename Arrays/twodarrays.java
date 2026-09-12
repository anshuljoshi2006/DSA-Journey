import java.util.*;
public class twodarrays{
    public static boolean search(int matrix[][] , int key){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at" +" " + "(" + i +"," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static int largestnumber(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int key = 6;

        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(matrix[i][j]);
            }
        System.out.println();
        }

        search(matrix,key);
        System.out.print(largestnumber(matrix));
    }
}