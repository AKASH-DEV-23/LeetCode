class Solution {
    public boolean isPerfectSquare(int num) {
        int d=(int)Math.sqrt(num);
        System.out.println(d);
        if(d*d==num)    return true;
        return false;
    }
}
