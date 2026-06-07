import java.util.*;
public class rotateBrute{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k){
        
        for(int j=0; j<k; j++){
        int n=arr.length;
        int last=arr[n-1];
            for(int i=n-1; i>0; i--){
                    arr[i]=arr[i-1];
            }
        arr[0]=last;
        }
    }
}