class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=piles[0];
        int ans=l;
        for(int num:piles)  r=Math.max(r,num);
        while(l<r){
            int mid=l+(r-l)/2;
            if(canEat(piles,mid,h)){
               r=mid;
                ans=mid;
            }else{
               l=mid+1;
            }
        }
        return l;
    }
    private boolean canEat(int[] piles, int speed, int h){
        int actualSpeed=0;
        for(int num:piles){
            actualSpeed+=num/speed;
            if(num%speed!=0)    actualSpeed+=1;
        }
        return actualSpeed<=h ? true: false;
    }
}
