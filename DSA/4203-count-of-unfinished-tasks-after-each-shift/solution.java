class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n=tasks.length;
        long[] pre=new long[n];
        pre[0]=tasks[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+tasks[i];
        }
        int[] ans=new int[shifts.length];
        long curr=0;
        for(int i=0;i<shifts.length;i++){
            curr+=shifts[i];
            if(curr>=pre[n-1]){
                ans[i]=0;
                curr=0;
            }else{
                int l=0;
                int r=n-1;
                while(l<r){
                    int mid=(l+r)>>>1;
                    if(pre[mid]>curr){
                        r=mid;
                    }else{
                        l=mid+1;
                    }
                    
                }
                ans[i]=n-l;
            }
        }
        return ans;
    }
}
