class Solution {
    public boolean isAnagram(String s, String t) {
       //Approach 2 : Use fixed size Array
       if(s.length()!=t.length()) return false;
       int validAna[] = new int[26];
       for(int i=0;i<s.length();i++){
        validAna[s.charAt(i)-'a']+=1;
        validAna[t.charAt(i)-'a']-=1;
       }
       for(int i : validAna){
        if(i!=0) return false;
       }
       return true;
    }
}
