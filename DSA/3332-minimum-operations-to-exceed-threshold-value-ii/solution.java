class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long num:nums){
            pq.offer(num);
        }
        int cnt=0;
        while(pq.peek()<k){
            long num=pq.poll()*2+pq.poll();
            pq.offer(num);
            cnt++;
        }
        return cnt;
    }
}
