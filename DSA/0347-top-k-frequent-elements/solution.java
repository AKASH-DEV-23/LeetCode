class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(mp.entrySet());
        Comparator<Map.Entry<Integer,Integer>> com=new Comparator<>(){
            public int compare(Map.Entry<Integer,Integer> ent1,Map.Entry<Integer,Integer> ent2){
                if(ent1.getValue()<ent2.getValue()) return 1;
                else if(ent1.getValue()>ent2.getValue()) return -1;
                else    return 0;
            }
        };
        Collections.sort(list,com);
        int[] ans=new int[k];
        int idx=0;
        for(Map.Entry<Integer,Integer> ent:list){
            ans[idx++]=ent.getKey();
            k--;
            if(k==0)    break;
        }
        return ans;
    }
}
