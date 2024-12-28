class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map=new HashMap<>();

        for(int num:tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int round=0;
        for(Integer key:map.keySet()){
            int count=map.get(key);
            if(count==1){
                return -1;
            }
            if(count%3==0){
                round+=count/3;
            }else{
                round+=(count/3)+1;
            }
        }
        return round;
    }
}
