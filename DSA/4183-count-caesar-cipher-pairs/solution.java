class Solution {
    public long countPairs(String[] words) {
        Map<String,Integer> mp=new HashMap<>();
        long cnt=0;
        for(String s:words){
            String can=toCan(s);
            cnt+=mp.getOrDefault(can,0);
            mp.put(can,mp.getOrDefault(can,0)+1);
        }
        return cnt;
    }

    private String toCan(String s){
        if(s.length()==0)  return s;
        int diff=s.charAt(0)-'a';
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            char sh=(char)('a'+(ch-'a'-diff+26)%26);
            sb.append(sh);
        }
        return sb.toString();
    }
}
