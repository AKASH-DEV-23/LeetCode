class Solution {
    public int[] numberGame(int[] nums) {
        int[] ans=new int[nums.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums)   pq.offer(num);
        int i=0;
        while(!pq.isEmpty()){
            int num1=pq.poll();
            int num2=pq.poll();
            ans[i++]=num2;
            ans[i++]=num1;
        }
        return ans;
    }
}
