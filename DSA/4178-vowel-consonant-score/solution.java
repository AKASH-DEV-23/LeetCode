class Solution {
    public int vowelConsonantScore(String s) {
        int vow=0;
        int con=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  vow++;
                else  con++;
            }
        }
        
        return con==0 ? 0 : vow/con;
    }
}
