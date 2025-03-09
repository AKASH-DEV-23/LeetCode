class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                list.add(i);
            }
        }
        int[] ans = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int idx=10000000;
            for(int j=0;j<list.size();j++){
               int mini=Math.abs(i-list.get(j));
               idx=Math.min(idx,mini);
            }
            ans[i]=idx;
        }
        return ans; 
    }
}
