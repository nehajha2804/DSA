class productOfNextElem{
    public static void main(String args[]){
        int [] nums ={1,2,3,4,5,6};
        int index=0;
        product(nums,index);
        
    }

    public static int[] product(int[] nums, int index){
        int [] result = new int[6];
        int n= nums.length;
        result[n-1]=nums[n-1];

        for(int i=0; i<n; i++){
           result[i]=nums[i]*nums[i+1];
            }
            return result;
        }
    }
