class Solution {
    public long dividePlayers(int[] skill) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int len=skill.length;
        int totalTeam=len/2;
        int tSum=0;
        for(int num:skill)  tSum+=num;
        if(tSum%totalTeam != 0)   return -1;
        int teamSkill=tSum/totalTeam;
        long chemistry=0;
        boolean flag=true;
        for(int num:skill){
            int diff=teamSkill-num;
            if(map.containsKey(diff)){
                long team=diff*num;
                chemistry+=team;
                int value=map.get(diff);
                if(value-1<1){
                    map.remove(diff);
                }else{
                    map.put(diff,value-1);
                }
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        if(map.size()!=0)   return -1;
        return chemistry;
    }
}
