class Solution {
    public int numRabbits(int[] answers) {
        if(answers.length==0)   return 0;
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int num:answers){
            if(num==0){
                ans+=1;
                continue;
            }
            if(!map.containsKey(num)){
                map.put(num,0);
                ans+=++num;
            }else{
                map.put(num,map.get(num)+1);
                if(map.get(num)==num){
                    map.remove(num);
                }
            }
        }
        return ans;
    }
}
