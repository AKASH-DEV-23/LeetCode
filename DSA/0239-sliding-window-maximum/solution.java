class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int j=0;
        ans[j]=nums[dq.peekFirst()];
        j++;
        for(int i=k;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            ans[j]=nums[dq.peekFirst()];
            j++;
        }
        return ans;
    }
}
