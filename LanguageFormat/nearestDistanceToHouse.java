import java.util.*;

public class nearestDistanceToHouse{
    public static void main(String args[]){
        int house[] = {1,2,3,4};
        int n = 4;
        System.out.println(Arrays.toString(minDistance(house,n)));
    }

    public static int[] minDistance(int house[], int n){
        int sumDistance[]= new int[n];
        
        for(int i=0; i<n; i++){
            int minDistance[] = new int [n-1];
            int selectedFrnds[] = new int [n-2];
            int p=0;
            for(int j=0; j<n; j++){
                if(i!=j){
                    minDistance[p] = Math.abs(house[i]-house[j]);
                    p++;
                   
                }               
            }
            Arrays.sort(minDistance);

            for(int k=0; k<n-2; k++){
                selectedFrnds[k] = minDistance[k];
            }
            
            for(int l=0; l<selectedFrnds.length; l++){
                 sumDistance[i] += selectedFrnds[l];
            }
           
        }

        return sumDistance;
    }
}