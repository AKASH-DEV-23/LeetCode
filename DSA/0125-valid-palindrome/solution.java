class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        // System.out.println(str);
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                sb.append(ch);
            }
        }
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        // System.out.println(sb);
        return true;
    }
}
