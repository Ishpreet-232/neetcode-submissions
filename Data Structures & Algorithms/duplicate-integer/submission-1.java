
class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>1) return true;
        }
        return false;
        */
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}