class Solution {
    public long flowerGame(int n, int m) {
        int odd1=(int)Math.ceil((n+1)/2);
        int even1=(int)Math.floor(n/2);
        int odd2=(int)Math.ceil((m+1)/2);
        int even2=(int)Math.floor(m/2);
        long ans = (long)odd1*even2+(long)odd2*even1;
        return ans;
    }
}