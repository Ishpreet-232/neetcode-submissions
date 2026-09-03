class Solution {
    public int maxArea(int[] heights) {
     // 2 pointers - opposite i.e. l and h, min(l,h) * (h-l) = max
     // if(l<h) l++;
     int l=0;
     int h=heights.length-1;
     int maxArea=0;
     while(l<h){
        int currArea = Math.min(heights[l],heights[h])*(h-l);
        maxArea=Math.max(maxArea,currArea);
        if(heights[l]<=heights[h]) l++;
        else h--;
     }
     return maxArea;
    }
}
