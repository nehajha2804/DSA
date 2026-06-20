import java.util.Arrays;

class productOfArray {

    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6};
        System.out.println((Arrays.toString(productExceptSelf(nums))));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int output[] = new int[n];
        for(int j = 0; j<n; j++){
            int product = 1;
            for(int i=0; i<j; i++){
                product = nums[i]*product;
            }

            for(int i = j+1; i<n; i++){
                product = nums[i]*product;
            }

            output[j]=product;
        }

        return output;
    }
}  
