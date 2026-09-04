class Solution {
    public int maxProfit(int[] prices) {
        int minValue=Integer.MAX_VALUE;
        int index = 0;
        int suffixMax[] = Arrays.copyOf(prices,prices.length);
        for(int i=prices.length-2;i>=0;i--){
           suffixMax[i]=Math.max(suffixMax[i],suffixMax[i+1]);
        }
        int maxProfit=0;
        for(int i=index;i<prices.length;i++){
            maxProfit=Math.max(maxProfit,suffixMax[i]-prices[i]);
        }
        if(maxProfit==0) return 0;
        return maxProfit;
    }
}
