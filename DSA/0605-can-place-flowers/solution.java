class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int zero=1;
        int cnt=0;
        for(int i=0;i<len;i++){
            if(flowerbed[i]==1){
                cnt+=(zero-1)/2;
                zero=0;
            } else if(flowerbed[i]==0) {
                zero++;
            }
        }
        zero++;
        cnt+=(zero-1)/2;
        return cnt>=n;
    }
}
