class Solution {
    public boolean uniformArray(int[] nums1) {
        List<Integer> list=new ArrayList<>();
        int even=0;
        int odd=0;
        int size=nums1.length;
        for(int num:nums1){
            if(num%2==0)  even++;
            else{
                odd++; 
                list.add(num);
            }
        }

        if(even==size || odd==size)  return true;
        Collections.sort(list);

        for(int num:nums1){
            if(num%2==0){
                if(!checkNum(num,list))  return false;
            }
        }

        return true;
    }

    private boolean checkNum(int target, List<Integer> list){
        int low=0;
        int high=list.size()-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(list.get(mid)>target){
                high=mid-1;
            }else{
                return true;
            }
        }

        return false;
    }
}
