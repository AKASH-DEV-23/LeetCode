class Solution {
    public int mirrorDistance(int n) {
        StringBuilder sb=new StringBuilder(n+"");
        sb.reverse();
        return Math.abs(n-Integer.parseInt(sb.toString()));
    }
}
