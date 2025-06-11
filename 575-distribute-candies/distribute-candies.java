class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Set<Integer> set=new HashSet<>();
        for(int num:candyType)  set.add(num);
        return Math.min(n,set.size());
    }
}