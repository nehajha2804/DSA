// TYPE 1
public class twoSumDuplicate{
    public static void main(String[] args) {
        int[] nums  = {1,1,2,2,3};
        int k = removeDuplicate(nums);
        int target = 3;

        if(k==target){
            System.out.println("Correct!");
        }else{
            System.out.println("Not found");
        }
    }

    public static int removeDuplicate(int[] nums){
        int slow = 0;
        for(int fast =1; fast<nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow + 1;
    }
}