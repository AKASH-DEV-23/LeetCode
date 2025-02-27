class Solution {
    public int minimumCost(int[] cost) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:cost){
            pq.offer(num);
        }
        int total=0;
        while(!pq.isEmpty() && pq.size()>2){
            total+=pq.poll();
            total+=pq.poll();
            pq.poll();
        }
        while(!pq.isEmpty()){
            total+=pq.poll();
        }
        return total;
    }
}