class Solution {

    public String encode(List<String> strs) {
        StringBuilder s= new StringBuilder();
        for(String st : strs){
            s.append(st.length()).append('#').append(st);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        String ns="";
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int l = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+l;
            list.add(str.substring(i,j));
            i=j;
        }
        return list;
    }
}
