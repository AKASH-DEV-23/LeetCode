class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int ans=Integer.MIN_VALUE;
        int n=energy.length;
        for(int i=n-1;i>=0;i--){
            if(i+k<n){
                energy[i]+=energy[i+k];
            }
            ans=Math.max(ans,energy[i]);
        }
        return ans;
    }
}
