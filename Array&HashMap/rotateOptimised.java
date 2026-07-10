import java.util.*;

public class rotateOptimised{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int k = 3 ;
        rotate(arr,k);

    }

    public static void rotate(int arr[], int k){
        int n = arr.length;
        int result[] = new int[n];

        for(int i=0; i<n; i++){
            result[(i+k)%n]=arr[i];
        }
        System.out.println(Arrays.toString(result));
        
    }
}