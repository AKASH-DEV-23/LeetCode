class Solution {
    public long minimumSteps(String s) {
        int zero=0;
        int one=0;
        long ans=0;
        char[] arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='0'){
                zero++;
            }else{
                ans+=zero;
            }
        }
        return ans;
    }
}
