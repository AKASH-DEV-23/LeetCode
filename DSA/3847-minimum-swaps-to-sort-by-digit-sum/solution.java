class Solution {
    public int minSwaps(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        for(int num:nums){
            ans.add(num);
        }
        Comparator<Integer> com=new Comparator<>(){
            public int compare(Integer num1,Integer num2){
                int sum1=findSum(num1);
                int sum2=findSum(num2);
                if(sum1<sum2){
                    return -1;
                }else if(sum1>sum2){
                    return 1;
                }else{
                    if(num1<num2){
                        return -1;
                    }else if(num1>num2){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }
        };
        Collections.sort(ans,com);
        Map<Integer,Integer> map=new HashMap<>();
        for(i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        int cnt=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=ans.get(i)){
                cnt++;
                int currValue=ans.get(i);
                int currIdx=map.get(currValue);
                int temp=nums[i];
                nums[i]=nums[currIdx];
                nums[currIdx]=temp;
                map.put(nums[i],i);
                map.put(nums[currIdx],currIdx);
            }
        }
        return cnt;
    }
    private int findSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
