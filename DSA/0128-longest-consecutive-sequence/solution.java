class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int num : nums){
            map.put(num,true);
        }
        for(int num : nums){
            if(map.containsKey(num -1 )){
                map.put(num,false);
            }
        }
        int maxLength = 0;
        for(int num : nums){
            if(map.get(num) == true){
                int length = 1;
                while(map.containsKey(num + length)){
                    length++;
                }
                if(length > maxLength){
                    maxLength = length;
                }
            }
           
        }
         return maxLength;
}
}
