class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] map=new int[k+1];
        int n=arr.length;
        for(int i=0; i<n; i++){
            int num=arr[i];
            num%=k;
            if(num<0)   num+=k;
            map[num]++;
        }
        if(map[0]%2 != 0){
            return false;
        }
        for(int rem=1; rem<=k/2; rem++){
            int diff=k-rem;
            if(map[rem] != map[diff]){
              return false;
            }
        }
        return true;
    }
}