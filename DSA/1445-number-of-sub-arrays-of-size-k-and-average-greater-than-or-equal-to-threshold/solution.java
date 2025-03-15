class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int j = 0;
        int i;
        int cnt=0;
        for (i = 0; i < Math.min(k, arr.length); i++) {
            sum += arr[i];
        }
        if(i==k){
            int val=sum/k;
            if(val>=threshold)  cnt++;
        }
        for(i=k;i<arr.length;i++){
            sum-=arr[j++];
            sum+=arr[i];
            int val=sum/k;
            if(val>=threshold)  cnt++;
        }
        return cnt;
    }
}
