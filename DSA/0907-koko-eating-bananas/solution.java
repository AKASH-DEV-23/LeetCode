class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int num:piles)  right=Math.max(right,num);

        while(left<right){
            int mid=(left+right) >>> 1;
            if(canEat(piles,mid,h)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    private boolean canEat(int[] piles, int speed, int h){
        int cnt=0;
        for(int pile:piles){
            cnt+=Math.ceil((double)pile/speed);
        }
        return cnt<=h?true:false;
    }
}
