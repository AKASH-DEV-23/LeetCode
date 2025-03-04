class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq=new int[1001];
        for(int num:arr1){
            freq[num]++;
        }
        int[] ans = new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            int cnt=freq[arr2[i]];
            while(cnt>0){
                ans[k++]=arr2[i];
                cnt--;
            }
            freq[arr2[i]]=0;
        }
        // System.out.println(Arrays.toString(ans));
        for(int i=0;i<freq.length;i++){
            int cnt=freq[i];
            while(cnt>0){
                ans[k++]=i;
                cnt--;
            }
        }
        return ans;
    }
}
