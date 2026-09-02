class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length<=1) return arr.length;
        Set<Integer> set = new HashSet<>();
      for(int i : arr) set.add(i);
      Map<Integer,List<Integer>> map = new HashMap<>();
      for(int i : arr){
        if(!set.contains(i-1)){
          map.put(i,new ArrayList<>());
        }
      }
      int length=0;
      for(int i : map.keySet()){
        int start = i;
        while(set.contains(start+1)){
          map.get(i).add(start+1);
          start+=1;
        }
        if(map.get(i).size()>length) length=map.get(i).size();
      }
      return length+1;
    }
}
