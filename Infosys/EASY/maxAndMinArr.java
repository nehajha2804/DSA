import java.util.Arrays;

public class maxAndMinArr{
    public static void main(String args[]){
        int nums[] = {1,3,2,5,6,7};

        System.out.print(Arrays.toString(maxAndMin(nums)));
    }

    public static int[] maxAndMin(int nums[]){
        int answer[] = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        answer[0] = min;
        answer[1] = max;

        return answer;

    }
}