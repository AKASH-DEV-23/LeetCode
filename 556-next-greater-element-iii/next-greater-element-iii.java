class Solution {
    public int nextGreaterElement(int n) {
        int[] nums=numToArray(n);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        boolean flag=true;
        for(int i=nums.length-1;i>=0;i--){
            if(!pq.isEmpty() && pq.peek()>nums[i]){
                List<Integer> list = new ArrayList<>();
                while(!pq.isEmpty() && pq.peek()>nums[i]){
                    list.add(pq.poll());
                }
                System.out.println(list);
                int curr=nums[i];
                nums[i]=list.get(list.size()-1);
                for(int j=0;j<list.size()-1;j++)    pq.offer(list.get(j));
                pq.offer(curr);
                flag=false;
                break;
            }
            pq.offer(nums[i]);
        }
        if(flag)    return -1;
        int i=nums.length-1;
        while(!pq.isEmpty()){
            nums[i--]=pq.poll();
        }
        int num= arrToNum(nums);
        return num;
    }

    private int[] numToArray(int n){
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        Collections.reverse(list);
        int[] ans = new int[list.size()];
        int i=0;
        for(int num:list){
            ans[i++]=num;
        }
        return ans;
    }

    private int arrToNum(int[] nums){
        long ans =0;
        for(int num:nums){
            ans=ans*10+num;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)  return -1;
        return (int)ans;

    }
}