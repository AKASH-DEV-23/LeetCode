class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        System.out.println(pq);
        while(pq.size()>1){
                int max=pq.poll();
                int min=pq.poll();
                if(max==min){
                continue;
                }else{
                int newVal=max-min;
                pq.add(newVal);
                }
        }

        if(pq.size()>0){
            return pq.poll();
        }
        return 0;
    }
}
