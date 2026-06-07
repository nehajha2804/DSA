import java.util.*;

public class reverse{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(reverse(arr,n)));
    }

    public static int[] reverse(int arr[], int n){
        
        if(n%2==0){
        for(int i=0; i<n/2; i++){
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i]=temp;
        }
        }else{
            for(int i=0; i<(n-1)/2; i++){
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i]=temp;
        }
        }

        return arr;
    }
}