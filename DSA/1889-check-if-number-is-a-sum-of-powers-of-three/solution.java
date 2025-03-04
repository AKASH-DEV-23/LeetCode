class Solution {
    public boolean checkPowersOfThree(int n) {
        int p=0;
        while(n>=Math.pow(2,p)) p++;
        while(n>0){
            if(n>= Math.pow(3,p))   n-=Math.pow(3,p);
            if(n>= Math.pow(3,p))   return false;
            p--;
        }
        return true;
    }
}
