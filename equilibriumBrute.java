public class equilibriumBrute{
    public static void main(String args[]){
        int arr[]={1,2,3,3};
        System.out.println(equili(arr));
    }

    public static int equili(int arr[]){
        int n=arr.length;
    
        for(int i=0; i<n; i++){
            int leftSide=0;
            int rightSide=0;

            //leftSide
            for(int j=0; j<i; j++){
                leftSide += arr[j];
            }

            for(int j=i+1; j<n; j++){
                rightSide += arr[j];
            }

            if(leftSide==rightSide){
                return i;
            }
        }
        return -1;
    }
}