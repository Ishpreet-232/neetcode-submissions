class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
     List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
    if(i>0 && arr[i]==arr[i-1]) continue;
    int l = i+1;
    int h = arr.length-1;
      while(l<h){
        int sum = arr[i]+arr[l]+arr[h];
          if(sum==0){
            list.add(new ArrayList<>(List.of(arr[i],arr[l],arr[h])));
          l++;
          h--;
        while(l<h && arr[l]==arr[l-1]) l++;
        while(l<h && arr[h]==arr[h+1]) h--;
          }
          else if(sum<0) l++;
          else h--;
    }
    }
    return list;
    }
}