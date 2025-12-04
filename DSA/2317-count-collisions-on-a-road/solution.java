class Solution {
    public int countCollisions(String arr) {
        int i=0;
        int n=arr.length();
        while(i<n){
            if(arr.charAt(i)=='L')  i++;
            else    break;
        }
        int j=n-1;
        while(j>=0){
            if(arr.charAt(j)=='R')  j--;
            else    break;
        }
        int cnt=0;
        for(int k=i;k<=j;k++){
            if(arr.charAt(k)!='S')  cnt++;
        }
        return cnt;
    }
}
