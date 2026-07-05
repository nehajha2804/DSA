import java.util.Arrays;

public class twoSumTarget{
    public static void main(String args[]){
        int nums[] = {1,2,3,4,6};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int nums[], int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[right] + nums[left];
            if(left!=right && sum==target){
                return new int[]{left+1, right+1};
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{-1,-1};
    }
}