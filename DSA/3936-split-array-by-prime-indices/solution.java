class Solution {
    public long splitArray(int[] nums) {
        boolean[] visited=new boolean[nums.length+1];
        visited[0]=visited[1]=true;
        for(int i=2;i*i<nums.length;i++){
            if(visited[i]==false){
                for(int j=i*i;j<nums.length;j+=i){
                    visited[j]=true;
                }
            }
        }
        long sum1=0;
        long sum2=0;
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true){
                sum1+=nums[i];
                }else  sum2+=nums[i];
        }
        // System.out.println(sum1 +" "+sum2);
        return Math.abs(sum1-sum2);
    }
}
