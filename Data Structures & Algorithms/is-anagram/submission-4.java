class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();
        for(char c : s.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        if(m1.size()!=m2.size()) return false;
        for(char c : m1.keySet()){
            if(!m1.get(c).equals(m2.getOrDefault(c,0))){
                 return false;
            }
        }
        return true;
    }
}
