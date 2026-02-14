class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> mp=new HashMap<>();
        for(String word:words){
            if(!(word.length()<k)){
                String str=word.substring(0,k);
                mp.put(str,mp.getOrDefault(str,0)+1);
            }
        }
        int ans=0;
        for(String key:mp.keySet()){
            if(mp.get(key)>1){
                ans++;
            }
        }
        return ans;
    }
}
