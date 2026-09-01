class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Arrays.sort(strs)
        HashMap<String,List<String>> map = new HashMap<>();
        for(String st : strs){
            char ch[] = st.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(st);
        }
        return new ArrayList<>(map.values());
    }
}
