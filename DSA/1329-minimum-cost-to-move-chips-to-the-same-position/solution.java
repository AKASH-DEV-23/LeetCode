class Solution {
    public int minCostToMoveChips(int[] position) {
        for(int i=0;i<position.length;i++){
            position[i]=position[i]%2;
        }
        int one=0;
        int zero=0;
        for(int num:position){
            if(num==0)  zero++;
            else    one++;
        }
        return Math.min(one,zero);
    }
}
