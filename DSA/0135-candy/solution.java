class Solution {
    public int candy(int[] ratings) {
        int len=ratings.length;
        int[] candy=new int[len];
        Arrays.fill(candy,1);
        for(int i=1;i<len;i++){
            if(ratings[i]>ratings[i-1])
                candy[i]=candy[i]>candy[i-1]?candy[i]:candy[i-1]+1;
        }
        for(int i=len-2;i>-1;i--){
            if(ratings[i]>ratings[i+1])
                candy[i]=candy[i]>candy[i+1]?candy[i]:candy[i+1]+1;
        }
        int totalCandy=0;
        for(int can:candy)  totalCandy+=can;
        return totalCandy;
    }
}
