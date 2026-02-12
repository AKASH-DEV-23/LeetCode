class Solution {
    public int longestBalanced(String s) {
        int ans=0;
        int size=s.length();

        for(int i=0;i<size;i++){
            int[] freq=new int[26];
            for(int j=i;j<size;j++){
                freq[s.charAt(j)-'a']++;
                if(solve(freq)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }

        return ans;
    }

    private boolean solve(int[] freq){
        Set<Integer> vis=new HashSet<>();
        for(int num:freq)   if(num!=0)  vis.add(num);
        return vis.size()==1?true:false;
    }
}
