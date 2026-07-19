class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex=new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        boolean[] visited=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']) continue;
            while(!st.isEmpty() && st.peek()>ch && lastIndex[st.peek()-'a']>i){
                visited[st.pop()-'a']=false;
            }  
            if(!visited[ch-'a']){
                st.push(ch);
                visited[ch-'a']=true;
            } 
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st) sb.append(ch);
        return sb.toString();
    }
}
