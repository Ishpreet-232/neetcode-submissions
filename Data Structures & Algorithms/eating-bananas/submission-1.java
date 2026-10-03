class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Optimized Binary Search Approach
        int low=1;
        int high = Integer.MIN_VALUE;
        for(int i : piles){
            if(i>high) high=i;
        }
        while(low<=high){
            long totalTime=0;
            int mid = low + (high-low)/2;
            for(int i : piles){
                totalTime+=(i+mid-1)/mid;
            }
            if(totalTime<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}
