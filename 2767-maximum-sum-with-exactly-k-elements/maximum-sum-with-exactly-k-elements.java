class Solution {
    public int maximizeSum(int[] nums, int k) {
        if(k==0)    return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums)   pq.offer(num);
        int sum=0;
        while(k>0){
            int num=pq.poll();
            sum+=num;
            pq.offer(num+1);
            k--;
        }
        return sum;
    }
}