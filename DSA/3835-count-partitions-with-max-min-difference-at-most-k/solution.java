class Solution {
    public int countPartitions(int[] arr, int k) {
        long pre[]=new long[arr.length+2];
        long dp[]=new long[arr.length+1];
        pre[1]=1;
        dp[0]=1;
        Deque<Integer> maxQ=new ArrayDeque<>();
        Deque<Integer> minQ=new ArrayDeque<>();
        int left=0;
        for(int i=1;i<=arr.length;i++){
            int idx=i-1;
            while(!minQ.isEmpty() && arr[minQ.peekLast()] >= arr[idx])  minQ.pollLast();
            minQ.offerLast(idx);
            while(!maxQ.isEmpty() && arr[maxQ.peekLast()]<=arr[idx])  maxQ.pollLast();
            maxQ.offerLast(idx);
            while(!minQ.isEmpty() && !maxQ.isEmpty() && 
                  (long)arr[maxQ.peekFirst()]-arr[minQ.peekFirst()]>k){
                left++;
                if(minQ.peekFirst()<left)  minQ.pollFirst();
                if(maxQ.peekFirst()<left)  maxQ.pollFirst();
            }
            long cnt=(pre[i]-pre[left]+1000000007)%1000000007;
            dp[i]=cnt;
            pre[i+1]=(pre[i]+dp[i]%1000000007);
        }
        return (int)dp[arr.length];
    }
}
