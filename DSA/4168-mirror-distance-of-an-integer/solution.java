class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        StringBuilder sb=new StringBuilder(n+"");
        sb.reverse();
        return Math.abs(temp-Integer.parseInt(sb.toString()));
    }
}
