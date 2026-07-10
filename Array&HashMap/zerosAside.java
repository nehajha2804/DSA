import java.util.*;
public class zerosAside{
    public static void main(String args[]){
        int arr[]={1,0,2,3,0,4};

        noZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void noZero(int[]arr){
        int n=arr.length;
        int j=0;

        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                int temp=arr[i]; 
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }
    }
}


