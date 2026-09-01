class Solution {
    public void prefixProductRight(int arr[]){
      int prev=arr[0];
      for(int i=1;i<arr.length;i++){
        int temp = arr[i];
        arr[i]=prev;
        prev*=temp;
      }
  }
  public void prefixProductLeft(int arr[]){
    int prev = arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--){
      int temp = arr[i];
      arr[i]=prev;
      prev*=temp;
    }
  }
    public int[] productExceptSelf(int[] nums) {
       int arr_copy[] = nums.clone();
       prefixProductRight(arr_copy);

      prefixProductLeft(nums);
      
      int arrFinal[] = new int[nums.length];
      int j=nums.length-1;
      arrFinal[0]=nums[0];
      arrFinal[nums.length-1]=arr_copy[nums.length-1];
      for(int i=1;i<nums.length-1;i++){
        arrFinal[i]= nums[i]*arr_copy[i];
      }
      return arrFinal;
    }
}  
