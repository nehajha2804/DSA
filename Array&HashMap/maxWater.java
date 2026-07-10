class maxWater{
       public static void main(String args[]){
        int [] arr={1,2,3,4,5};
        int solution=solution(arr);
        System.out.println(solution);
    }

    public static int solution(int[] arr){
        int res=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++ ){
                int product=arr[i]*arr[j];
                res=Math.max(product, res);
            }
        }
        return res;
    }
}