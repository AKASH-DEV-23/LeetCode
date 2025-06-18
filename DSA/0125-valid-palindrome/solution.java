class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9')    sb.append(ch);
        }
        System.out.println(sb);
        String s2=sb.toString().toLowerCase();
        String s1=sb.reverse().toString().toLowerCase();
        return s1.equals(s2);
    }
}
