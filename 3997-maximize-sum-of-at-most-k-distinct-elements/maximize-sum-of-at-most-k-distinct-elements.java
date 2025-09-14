class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> vis=new HashSet<>();
        for(int num:nums)   vis.add(num);
        PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:vis)  maxpq.add(num);
        int[] ans=new int[Math.min(maxpq.size(),k)];
        int idx=0;
        while(!maxpq.isEmpty() && k-- >0){
            ans[idx++]=maxpq.poll();
        }
        return ans;
    }
}