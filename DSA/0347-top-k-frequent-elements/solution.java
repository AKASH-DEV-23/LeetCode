class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums)   freq.put(num,freq.getOrDefault(num,0)+1);
        List<Map.Entry<Integer,Integer>> myList=new ArrayList<>(freq.entrySet());
        Comparator<Map.Entry<Integer,Integer>> com=new Comparator<>(){
            public int compare(Map.Entry<Integer,Integer> entry1, 
                Map.Entry<Integer,Integer> entry2){
                    if(entry1.getValue()>entry2.getValue())   return -1;
                    else if(entry1.getValue()<entry2.getValue())    return 1;
                    else return 0;
            }
        };
        Collections.sort(myList,com); 
        int[] ans=new int[k]; 
        for(int i=0;i<k;i++){
            ans[i]=myList.get(i).getKey();
        }
        return ans;
    }
}
