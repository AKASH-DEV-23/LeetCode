class Solution {
    public int countSubstrings(String s) {
        int cntPalindrome=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++)
                if(isPalindrome(s,i,j)) cntPalindrome++;
        }
        return cntPalindrome;
    }
    private boolean isPalindrome(String mystr, int left, int right){
        while(left<=right){
            if(mystr.charAt(left)==mystr.charAt(right)){ 
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
