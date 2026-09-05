class Solution {
    public int lengthOfLongestSubstring(String s) {
      if(s.length()<=1) return s.length();
      Map<Character,Integer> map = new HashMap<>();
      int maxLength=0;
      int left=0;
      char []ch = s.toCharArray();
      for(int i=0; i<ch.length; i++){
        char c = ch[i];
        if(map.containsKey(c)){
          left = Math.max(left,map.get(c)+1);
        }
        map.put(c,i);
       maxLength = Math.max(maxLength,i-left+1);
      }
      return maxLength;
    }
}
