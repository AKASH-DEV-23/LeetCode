class Solution {
    static int[] ans;
    static{
        ans=new int[46];
        ans[1]=1;
        ans[2]=2;
        for(int i=3;i<46;i++)   ans[i]=ans[i-2]+ans[i-1];   
    }
    public int climbStairs(int n) {
        // System.out.println(Arrays.toString(ans));
        return ans[n];
    }
}

// 1,2,
