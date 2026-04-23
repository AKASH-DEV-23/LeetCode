class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalBou=(long)k*m;
        if(totalBou>bloomDay.length) return -1;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int bl:bloomDay){
            if(bl<left)     left=bl;
            if(bl>right)    right=bl;
        }

        while(left<right){
            int mid=(left+right) >>> 1;
            if(makeBouquets(bloomDay,m,k,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }

        return left;
    }

    private boolean makeBouquets(int[] bloomDay, int m, int k, int mid){
        int cnt=0;
        for(int bl:bloomDay){
            if(bl<=mid){
                cnt++;
            }else{
                cnt=0;
            }
            if(cnt==k){
                m--;
                cnt=0;
            }
            if(m==0)    return true;
        }
        return false;
    }
}
