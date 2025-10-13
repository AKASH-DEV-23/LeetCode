class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> st=new Stack<>();
        for(String temp:words){
            if(!st.isEmpty() && check(st.peek(),temp)){
                continue;
            }
            st.push(temp);
        }
        List<String> ans=new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
    private boolean check(String s1, String s2){
        int[] freq=new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            freq[ch-'a']--;
        }
        for(int num:freq){
            if(num!=0)  return false;
        }
        return true;
    }
}