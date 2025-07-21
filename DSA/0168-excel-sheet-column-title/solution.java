class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber-=1;
            int rem=columnNumber%26;
            char ch=(char)('A'+rem);
            sb.append(ch);
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}
