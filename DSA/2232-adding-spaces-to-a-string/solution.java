class Solution {
    public String addSpaces(String s, int[] spaces) {
        int idx=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(idx<spaces.length && i==spaces[idx]){
                str.append(" ");
                idx++;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
