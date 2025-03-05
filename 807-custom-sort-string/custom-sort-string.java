class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer>  map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<order.length();i++){
            char ch = order.charAt(i);
            if(map.containsKey(ch)){
                int cnt = map.get(ch);
                while(cnt>0){
                    ans.append(ch);
                    cnt--;
                }
                map.remove(ch);
            }
        }
        for(char key:map.keySet()){
            int cnt=map.get(key);
            while(cnt>0){
                ans.append(key);
                cnt--;
            }
        }
        return ans.toString();
    }
}