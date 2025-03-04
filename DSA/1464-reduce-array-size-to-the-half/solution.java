class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n=arr.length/2;
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int key:map.keySet()){
            pq.offer(map.get(key));
        }
        int cnt=0;
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
            cnt++;
            if(sum>=n)  return cnt;
        }
        return 0;
    }
}
