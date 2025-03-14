class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr=new int[26];
        for(char ch:s1.toCharArray())   arr[ch-'a']++;
        int j=0;
        int n=s1.length();
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
            if(i-j+1==n){
                if(checkZeros(arr)) return true;
                arr[s2.charAt(j)-'a']++;
                j++;
            }
        }
        return false;
    }
    private boolean checkZeros(int[] arr){
        for(int num:arr){
            if(num!=0)  return false;
        }
        return true;
    }
}
