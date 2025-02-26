class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        for(int num:nums){
            if(num>0){
                pq1.offer(num);
            }
        }
        int cnt=0;
        while(pq1.size()>0 || pq2.size()>0){
            int num=pq1.poll();
            while(!pq1.isEmpty()){
                int newNum=pq1.poll()-num;
                if(newNum>0)
                    pq2.offer(newNum);
            }
            while(!pq2.isEmpty()){
                pq1.offer(pq2.poll());
            }
            cnt++;
        }
        return cnt;
    }
}
