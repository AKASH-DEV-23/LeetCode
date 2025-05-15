class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans=new ArrayList<>();
        int i=1;
        int j=1;
        int n=words.length;
        ans.add(words[0]);
        while(j<n){
            if(groups[i]!=groups[i-1]){
                ans.add(words[i]);
            }
            i++;
            j++;
        }
        return ans;
    }
}