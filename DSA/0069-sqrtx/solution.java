class Solution {
    public int mySqrt(int x) {
        if(x<=1)    return x;
        int low=1;
        int high=x;
        while(low<high){
            int mid=(low+high) >>> 1;
            if((long)mid*mid>x){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low-1;
    }
}
