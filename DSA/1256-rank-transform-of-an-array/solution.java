class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> vis=new HashSet<>();
        for(int num:arr)   vis.add(num);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:vis)    pq.offer(num);
        int rank=1;
        Map<Integer,Integer> mp=new HashMap<>();
        while(!pq.isEmpty()){
            mp.put(pq.poll(),rank++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}
