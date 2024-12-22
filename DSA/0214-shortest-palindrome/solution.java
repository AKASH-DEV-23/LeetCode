class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s+"*"+rev;

        int lps[] = new int[combined.length()];
        int i =1 , len = 0;
        while(i < combined.length()){
            if(combined.charAt(i) == combined.charAt(len)){
                lps[i] = len+1;
                i++;
                len++;
            }
            else{
                if(len > 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int len2 = n - lps[combined.length()-1];
        if(len2 > 0){
            StringBuilder sb = new StringBuilder();
            sb.append(rev.substring(0 , len2));
            sb.append(s);
            return sb.toString();
        }
        return s;
    }
}
