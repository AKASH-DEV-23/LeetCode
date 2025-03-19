class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                cnt=arr[i];
                break;
            }
        }
        for(int num:arr){
            if(num!=0 && num!=cnt)  return false;
        }
        return true;
    }
}
