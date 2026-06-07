public class secondLargOptimised{
    public static void main(String args[]){
        int arr[]={1,18,5,6,9};
        System.out.println(secLargOpt(arr));
    }

    public static int secLargOpt(int arr[]){
        int n=arr.length;
        int largestInt=arr[0];

        for(int i=1; i<n; i++ ){
            if(arr[i]>largestInt){
                largestInt=arr[i];
            }
        }

        int secondLargestInt=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] != largestInt && arr[i]>secondLargestInt){ 
                secondLargestInt=arr[i];
        }
        }


        if(secondLargestInt == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargestInt;
        
    }
}