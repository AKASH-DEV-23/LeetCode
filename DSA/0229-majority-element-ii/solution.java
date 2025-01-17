class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int cnd1=Integer.MIN_VALUE;
        int cnd2=Integer.MIN_VALUE;

        for(int num:nums){
            if(cnt1==0 && num!=cnd2){
                cnt1++;
                cnd1=num;
            } else if(cnt2==0 && num !=cnd1){
                cnt2++;
                cnd2=num;
            }else if(num==cnd1){
                cnt1++;
            }else if(num==cnd2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums){
            if(num==cnd1)   cnt1++;
            if(num==cnd2)   cnt2++;
        }

        int max=nums.length/3;
        if(cnt1>max)    list.add(cnd1);
        if(cnt2>max)    list.add(cnd2);
        
        return list;
    }
}
