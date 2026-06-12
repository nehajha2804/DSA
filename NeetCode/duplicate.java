import java.util.HashMap;
public class duplicate{
    public static void main(String args[]){
        int arr[] = {1,2,3,5,3,4};
        System.out.println(duplicate(arr));
    }

    public static boolean duplicate (int arr[]) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                return true;
            }else{
                map.put(arr[i], 1);
            }
        }
        return false;
    }
}