class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        int m=s.length();
        int n=part.length();
        for(int i=0;i<m;i++){
            sb.append(s.charAt(i));
            if(sb.length()>=n){
                String str=sb.substring(sb.length()-n);
                if(str.equals(part)){
                    sb.setLength(sb.length()-n);
                }
            }
        }
        return sb.toString();
    }
}
