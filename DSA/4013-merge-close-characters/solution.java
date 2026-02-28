class Solution {
    public String mergeCharacters(String s, int k) {
        Stack<Character> st=new Stack<>();
        int[] cnt=new int[26];
        Arrays.fill(cnt,-1);
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && cnt[ch-'a']!=-1){
                int size=st.size();
                int gap=size-cnt[ch-'a'];
                if(gap>k){
                    cnt[ch-'a']=size;
                    st.push(ch);
                }
            }else if(st.isEmpty()){
                cnt[ch-'a']=0;
                st.push(ch);
            }else{
                cnt[ch-'a']=st.size();
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
