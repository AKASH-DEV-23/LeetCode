class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, ArrayList<Integer>> map=new HashMap<>();
        for(int num:nums){
            int key=digit(num);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(num);
        }
        int maxSum=-1;
        for(int key: map.keySet()){
            ArrayList<Integer> list = map.get(key);
            Collections.sort(list);
            int n=list.size();
            if(n>=2){
                int sum=list.get(n-1)+list.get(n-2);
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    private int digit(int num){
        int ans=0;
        while(num>0){
            ans+=num%10;
            num/=10;
        }
        return ans;
    }
}