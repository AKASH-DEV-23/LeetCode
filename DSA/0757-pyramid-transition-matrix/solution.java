class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String,List<Character>> mp=new HashMap<>();
        for(String temp:allowed){
            String key=temp.substring(0,2);
            Character val=temp.charAt(2);
            if(!mp.containsKey(key))    mp.put(key,new ArrayList<>());
            mp.get(key).add(val);
        }
        return solve(bottom,0,"",mp);
    }
    private boolean solve(String bottom, int idx, String top,Map<String,List<Character>> mp){
        if(top.length()==bottom.length()-1){
            if(top.length()==1) return true;
            else  return  solve(top,0,"",mp);
        }
        if(idx==bottom.length()-1)  return false;
        String key=bottom.substring(idx,idx+2);
        if(mp.containsKey(key)){
            for(Character ch: mp.get(key)){
                if(solve(bottom,idx+1,top+ch,mp))   return true;
            }
        }
        return false;
    }
}
