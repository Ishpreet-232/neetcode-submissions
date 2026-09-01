class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r =s.length()-1;
        while(l<r){
            char c = s.charAt(l);
            char ch = s.charAt(r);
            if(!Character.isLetterOrDigit(c)){
                l++;
                continue;
            }
            else if(!Character.isLetterOrDigit(ch)){
                r--;
                continue;
            }
            else{
                if(Character.toLowerCase(ch)!=Character.toLowerCase(c))return false;
                l++;
                r--;
            }
        }
        return true;
    }
}
