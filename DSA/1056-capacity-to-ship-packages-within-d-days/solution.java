class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=1;
        int high=0;
        for(int wei:weights){
            high+=wei;
            low=Math.max(low,wei);
        }    
        while(low<high){
            int mid=(low+high) >>> 1;
            if(isFeasible(weights,mid,days)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    private boolean isFeasible(int[] arr, int weight, int days){
        int total=0;
        int cnt=1;
        for(int num:arr){
            total+=num;
            if(total>weight){
                cnt++;
                total=num;
            }
        }
        return cnt<=days ? true:false;
    }
}

