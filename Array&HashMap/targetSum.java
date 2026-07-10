class targetSum{
    public static void main(String args[]){
        int [] nums={1,2,3,4,5};
        int target=7;
        int result = findsum(nums, target);
        if(result==1){
            System.out.println("Pair found");
        }else{
            System.out.println("Pair not found");
        }
        
    }

    public static int findsum(int[]nums, int target){
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    return 1;
                }
            }
        }
        return 0;
    }
}