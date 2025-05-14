class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']=i;
        }
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int end=0;
        int start=0;
        while(i<n){
            end=Math.max(end,freq[s.charAt(i)-'a']);
            if(i==end){
                ans.add(end-start+1);
                start=end+1;
            }
            i++;
        }
        return ans;
    }
}
