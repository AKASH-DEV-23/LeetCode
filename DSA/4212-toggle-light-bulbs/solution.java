class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] freq=new int[101];
        for(int curr:bulbs){
            freq[curr]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<101;i++){
            int curr=freq[i];
            if(curr%2!=0)  ans.add(i);
        }
        return ans;
    }
}
