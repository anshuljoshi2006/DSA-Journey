import java.util.*;
public class LinearSearch{
public static int Linear(int numbers[] , int key ){
    for(int i=1 ; i<=numbers.length ; i++){
        if(numbers[i] == key){
            return i;
        }
    }
    return -1;
}
public static void main(String args[]){
    int numbers[] = {1,2,3,4,5,6,7,8,9,10};
    int key = 5;

    int index = Linear(numbers,key);

    System.out.print(index);
    }
}