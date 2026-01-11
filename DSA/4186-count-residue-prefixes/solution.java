class Solution {
    public int residuePrefixes(String s) {
        int n=s.length();
        int[] freq=new int[n];
        freq[0]=1;
        Set<Character> vis=new HashSet<>();
        vis.add(s.charAt(0));
        for(int i=1;i<n;i++){
            if(!vis.contains(s.charAt(i))){
                freq[i]=freq[i-1]+1;
                vis.add(s.charAt(i));
            }else{
                freq[i]=freq[i-1];
            }
        }
        // System.out.print(Arrays.toString(freq));
        int ans=0;
        for(int i=0;i<n;i++){
            int len=(i+1);
            if(freq[i]==(len%3)) ans++;
        }
        return ans;
    }

}
