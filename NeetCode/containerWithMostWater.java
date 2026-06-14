import java.util.*;

public class containerWithMostWater{
    public static void main(String args[]){
        int height[] = {1,2,6,8,9,6,5};
        System.out.println(volumeOfWater(height));
    }

    public static int volumeOfWater(int height[]){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<height.length-1; i++){
            for(int j=i+1; j<height.length; j++){
                int heigth = Math.min(height[i], height[j]);
                int width =  Math.abs(i-j);
                int volume = heigth * width;
                map.put(volume, 1);
            }
        }
        int output = Collections.min(map.keySet());
        return output;
    }
}