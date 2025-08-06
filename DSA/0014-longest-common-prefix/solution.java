class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp=strs[0];
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            temp=solve(temp,strs[i]);
            ans=temp;
        }
        return ans;
    }
    private String solve(String str1, String str2){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<str1.length() && i<str2.length()){
            if(str1.charAt(i)!=str2.charAt(i))  return sb.toString();
            sb.append(str1.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
