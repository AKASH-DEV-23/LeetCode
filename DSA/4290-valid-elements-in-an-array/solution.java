class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int size=nums.length;
        int[] prefix=new int[size];
        prefix[0]=nums[0];
        for(int i=1;i<size;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }

        int[] suffix=new int[size];
        suffix[size-1]=nums[size-1];
        for(int i=size-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],nums[i]);
        }
        List<Integer> ans=new ArrayList<>();
        Set<Integer> vis=new HashSet<>();
        boolean[] mark=new boolean[size];
        int idx=0;
        for(int tmp:prefix){
            if(!vis.contains(tmp)){
                ans.add(tmp);
                mark[idx]=true;
            }
            idx++;
            vis.add(tmp);
        }
        for(int i=0;i<size;i++){
            int tmp=nums[i];
            boolean flag=true;
            for(int j=i+1;j<size;j++){
                if(nums[j]>=tmp) flag=false;
            }
            if(flag && !mark[i]) ans.add(tmp);
        }
        return ans;
        
    }
}
