public class duplicateBrute{
    public static void main(String args[]){
        int arr[]={1,4,6,6,7,9};
        System.out.println(dupliBrute(arr));
    }

    public static int dupliBrute(int arr[]){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){

                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found: " + arr[i]);
                    return arr[i];
                }

            }
        }

        return -1;
    }
}