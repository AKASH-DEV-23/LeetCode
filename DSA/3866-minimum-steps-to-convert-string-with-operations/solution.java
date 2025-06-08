class Solution {
    public int minOperations(String word1, String word2) {
        int[] dp=new int[word1.length()+1];
        Arrays.fill(dp,word1.length()+1);
        dp[0]=0;
        for(int i=1;i<=word1.length();i++){
            for(int j=0;j<i;j++){
                String s2=word2.substring(j,i);
                String s1=word1.substring(j,i);
                dp[i]=Math.min(dp[i],dp[j]+cost(s1,s2));
            }
        }
        return dp[word1.length()];
    }
    private int cost(String s1, String s2){
        int c1=diff(s1,s2);
        String rev=new StringBuilder(s1).reverse().toString();
        return s1.equals(rev)?c1:Math.min(c1,1+diff(rev,s2));
    }
    private int diff(String s1, String s2){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))  list.add(i);
        }
            boolean[] visited=new boolean[list.size()];
            int sw=0;
            for(int i=0;i<list.size();i++){
                if(visited[i])  continue;
                for(int j=i+1;j<list.size();j++){
                    if(visited[j])  continue;
                    int y=list.get(j);
                    int x=list.get(i);
                    if(s1.charAt(x)==s2.charAt(y) && s1.charAt(y)==s2.charAt(x)){
                        sw++;
                        visited[j]=true;
                        visited[i]=true;
                        break;
                    }
                }
            }
        return sw+(list.size()-2*sw);
    }
}
