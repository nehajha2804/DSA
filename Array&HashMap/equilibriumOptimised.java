public class equilibriumOptimised{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,1};
        equilibrium(arr);
    }

    public static int equilibrium(int arr[]){
        int n=arr.length;
        int leftSide = 0;
        int rightSide; 
        int total=0;

        for(int i=0; i<n; i++){
                total+=arr[i];
        }

            //left side
            for(int j=0; j<n; j++){
                leftSide+=arr[j];
            }

            rightSide=total-leftSide;

            if(rightSide==leftSide){
                return 0;
            }
            
        return -1;
        }
    
  
    }

