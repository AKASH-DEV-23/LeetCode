class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                   int one=Math.abs(arr[i]-arr[j]);
                   int two=Math.abs(arr[j]-arr[k]);
                   int three=Math.abs(arr[i]-arr[k]);
                   if(one<=a && two <=b && three<=c){
                    cnt++;
                   }
                }
            }
        }
        return cnt;
    }
}