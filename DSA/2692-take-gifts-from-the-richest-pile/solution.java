class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:gifts){
            pq.add(num);
        }
        for(int i=0;i<k;i++){
            int num=pq.poll();
           pq.add((int)Math.sqrt(num));
        }
        long result=0;
        for(int num:pq){
            result+=num;
        }
        return result;
    }
}
