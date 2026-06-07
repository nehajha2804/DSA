import java.util.*;

public class secondLargestBrut{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(secLar(arr));
    }

    public static int secLar(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        int largest=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                return arr[i];
            }   
        }
    return largest;
}
}