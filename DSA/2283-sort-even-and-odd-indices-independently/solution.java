class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                pq.add(nums[i]);
            }
        }
        int j=0;
        while(pq.size()>0){
            nums[j]=pq.poll();
            j+=2;
        }

        PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                maxpq.add(nums[i]);
            }
        }
        j=1;
        while(maxpq.size()>0){
            nums[j]=maxpq.poll();
            j+=2;
        }
        return nums;
    }
}
