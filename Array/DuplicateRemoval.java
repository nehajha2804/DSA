import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {

    
//BRUTE FORCE:

//         int n= nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                if(nums[i]==nums[j]){
//                 return true;
//                }
//             }
//         }

//         return false; 

// USING SORTING:

//     Arrays.sort(nums);
//     int n=nums.length;
//     for(int i=1; i<n; i++){
//         if(nums[i]==nums[i-1]){
//         return true;
//         }
//     }
//     return false;

//USING HASHMAP:

HashSet<Integer> set= new HashSet<>();
for(int n:nums){
    if(set.contains(n)){
        return true;
    }
    set.add(n);
}


return false;


}

}
