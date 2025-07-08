class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums)   freq.put(num,freq.getOrDefault(num,0)+1);
        Comparator<Map.Entry<Integer,Integer>> com=new Comparator<>(){
            public int compare(Map.Entry<Integer,Integer> entry1, 
            Map.Entry<Integer,Integer> entry2) {
                if(entry1.getValue()<entry2.getValue()) return 1;
                else if(entry1.getValue()>entry2.getValue())    return -1;
                else return 0;
            }
        };
        List<Map.Entry<Integer,Integer>> sortedList=new ArrayList<>(freq.entrySet());
        Collections.sort(sortedList,com);
        int highFreq=sortedList.get(0).getValue();
        List<Integer> maxFreqElement=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:sortedList){
            if(entry.getValue()==highFreq)  maxFreqElement.add(entry.getKey());
            else break;
        }
        int miniAns=Integer.MAX_VALUE;
        for(int key:maxFreqElement){
            int left=0;
            int right=0;
            boolean flag1=true;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==key && flag1){
                    left=i;
                    flag1=false;
                }
                if(nums[i]==key){
                    right=i;
                }
            }
            miniAns=Math.min(miniAns,right-left+1);
        }
        
        return miniAns;
    }
}
