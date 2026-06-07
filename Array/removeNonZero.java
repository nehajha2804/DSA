class removeNonZero{
  int slow=0;
for(int fast=0; fast<arr.length; fast++){
if(arr[fast]!=0){
//swap(fast,slow)
int temp=arr[fast];
arr[fast]=arr[slow];
arr[slow]=temp;
slow++;
}
}
