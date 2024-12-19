class Solution {
    public int maxChunksToSorted(int[] arr) {
        int cnt=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
           arr[i]=arr[i]+arr[i-1];
        }

        int i=0;
        for(int num:arr){
            int sum=(i*(i+1))/2;
            i++;
            if(sum==num){
                cnt++;
            }
        }
        return cnt;
    }
}
