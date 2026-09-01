class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>  map = new HashMap<>();
        int k=0;
        for(int i : nums){
            int value = target - i;
            if(map.getOrDefault(value,-1)!=-1){
                return new int[]{map.get(value),k};
            }
            map.put(i,k);
            k++;
        }
        return new int[]{};
    }
}
