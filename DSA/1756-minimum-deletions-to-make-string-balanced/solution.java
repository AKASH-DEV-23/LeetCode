class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st=new Stack<>();
        int ans=0;

        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && ch=='a'){
                st.pop();
                ans++;
            }
            else if(ch=='b'){
                st.push(ch);
            }
        }

        return ans;
    }
}
