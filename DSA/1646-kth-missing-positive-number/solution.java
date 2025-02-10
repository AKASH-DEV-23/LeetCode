class Solution {
    public int findKthPositive(int[] arr, int k) {
       Set<Integer> set = new HashSet<>();
       for(int num:arr){
        set.add(num);
       }
        int cnt=1;
        int point=0;
        while(true){
            if(!set.contains(cnt)){
                point++;
            }
            if(point==k)    break;
            cnt++;
        }
        return cnt;
    }
}
