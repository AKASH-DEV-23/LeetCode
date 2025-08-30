class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr=new int[10];
        while(n!=0){
            arr[n%10]++;
            n/=10;
        }
        int ans=0;
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(arr[i] !=0 && arr[i]<maxi){
                maxi=arr[i];
                ans=i;
            }
        }
        return ans;
    }
}
