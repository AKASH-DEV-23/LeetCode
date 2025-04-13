class Solution {
    public int findClosest(int x, int y, int z) {
        int person1=Math.abs(z-x);
        int person2=Math.abs(z-y);
        if(person1==person2){
            return 0;
        }
        return person1<person2 ? 1 : 2;
    }
}
