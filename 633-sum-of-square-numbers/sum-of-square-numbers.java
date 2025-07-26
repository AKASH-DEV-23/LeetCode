class Solution {
    public boolean judgeSquareSum(int c) {
        int st=0;
        int end=(int)Math.sqrt(c);
        while(st<=end){
            long multi=(long)st*st+end*end;
            if(multi==c) return true;
            if(multi<c)   st++;
            else end--;
        }
        return false;
    }
}