class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> vis=new HashSet<>();
        int[] ans=new int[friends.length];
        for(int num:friends)  vis.add(num);
        int idx=0;
        for(int num:order){
            if(vis.contains(num))  ans[idx++]=num;
        }
        return ans;
    }
}
