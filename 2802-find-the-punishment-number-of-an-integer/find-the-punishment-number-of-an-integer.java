class Solution {
    public int punishmentNumber(int n) {
        int punish=0;
        for(int i=1;i<=n;i++){
            int sq=i*i;
            boolean ans = check(sq,0,i);
            if(ans){
                punish+=sq;
            }
        }
        return punish;
    }

    private boolean check(int num, int currSum, int target){
        if(num==0){
            return currSum==target;
        }
        if(currSum>target)  return false;

        boolean modulo_10 = check(num/10, currSum+num%10, target);
        boolean modulo_100 = check(num/100, currSum+num%100, target);
        boolean modulo_1000 = check(num/1000, currSum+num%1000, target);
        boolean modulo_10000 = check(num/10000, currSum+num%10000, target);

        return modulo_10 || modulo_100 || modulo_1000 || modulo_10000;
    }
}