class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int num:bills){
            if(num==5){
                five++;
                continue;
            }else if(num==10){
                ten++;
                if(five>0){
                    five--;
                }else{
                    return false;
                }
            }else if(num==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
