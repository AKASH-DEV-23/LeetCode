class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    int n;
    Boolean[][] dp=new Boolean[2001][2001];
    public boolean canCross(int[] stones) {
        n=stones.length;
        for(int i=0;i<n;i++){
            map.put(stones[i],i);
        }
        return solve(stones,0,0);
    }
    private boolean solve(int[] stones,int currStoneIdx, int prevJump){
        if(currStoneIdx==n-1) return true;
        if(dp[currStoneIdx][prevJump]!=null)  return dp[currStoneIdx][prevJump]; 
        boolean ans=false;
        for(int nextJump=prevJump-1;nextJump<=prevJump+1;nextJump++){
            if(nextJump>0){
                int nextStone=stones[currStoneIdx]+nextJump;
                if(map.containsKey(nextStone)){
                    ans=ans || solve(stones,map.get(nextStone),nextJump);
                }
            }
        }
        return dp[currStoneIdx][prevJump]=ans;
    }
}
