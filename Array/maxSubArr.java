class maxSubArr{
    public static void main(String agrs[]){
        int[] arr={1,2,3,4,5,-6,8};
        solution(arr);
    }

    public static int solution(int[] arr){
        int n=arr.length;
        int res=0;
        for(int i=0; i<n; i++){
            int currSum=0;
            for(int j=0; j<n; j++){
                currSum += arr[j];
                res=Math.max(currSum, res);
            }
        }
        return res;    
    }
}