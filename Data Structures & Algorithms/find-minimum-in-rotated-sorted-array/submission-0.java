class Solution {
    public int findMin(int[] nums) {
        //Basic Linear Search Approach
        int min=Integer.MAX_VALUE;
        for(int n : nums){
            if(n<min) min=n;
        }
        return min;
    }
}
