class Solution {
    public String reverseByType(String s) {
        StringBuilder small=new StringBuilder();
        StringBuilder spe=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                small.append(ch);
            }else{
                spe.append(ch);
            }
        }
        small.reverse();
        spe.reverse();
        int sm=0;
        int sp=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                ans.append(small.charAt(sm++));
            }else{
                ans.append(spe.charAt(sp++));
            }
        }
        return ans.toString();
    }
}
