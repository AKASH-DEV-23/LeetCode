class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int st=0; 
            int end=n-1;
            int cost=0;
            while(st<i){
                if(boxes.charAt(st)=='1'){
                    cost+=i-st;
                }
                st++;
            }
            while(end>i){
                if(boxes.charAt(end)=='1'){
                    cost+=end-i;
                }
                end--;
            }
            ans[i]=cost;
        }
        return ans;
    }
}
