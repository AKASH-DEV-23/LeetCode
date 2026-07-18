class Solution {
    public int minCost(String source, String target, List<List<String>> rules, int[] costs) {
        int n=source.length();
        if(n!=target.length())  return -1;
        
        char[] S=source.toCharArray();
        char[] T=target.toCharArray();

        int R=rules.size();
        int[] rulelen1=new int[R];
        int[] rulecost1=new int[R];
        char[][] rulePat=new char[R][];
        char[][] ruleRep=new char[R][];
        for(int i=0;i<R;i++){
            List<String> rule=rules.get(i);
            String p=rule.get(0);
            String r=rule.get(1);
            int L=p.length();
            rulelen1[i]=L;
            rulePat[i]=p.toCharArray();
            ruleRep[i]=r.toCharArray();
            int stars=0;
            for(char ch:rulePat[i]){
                if(ch=='*')  stars++;
            }
            rulecost1[i]=costs[i]+stars;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++){
            if(dp[i]==Integer.MAX_VALUE)  continue;

            if(S[i]==T[i]){
                dp[i+1]=Math.min(dp[i+1],dp[i]);
            }

            for(int j=0;j<R;j++){
                int L=rulelen1[j];
                if(i+L>n)  continue;
                char[] P=rulePat[j];
                char[] Rep=ruleRep[j];
                boolean ok=true;
                for(int k=0;k<L;k++){
                    if(P[k]!='*' && P[k]!=S[i+k]){
                        ok=false;
                        break;
                    }
                    if(Rep[k] !=T[i+k]){
                        ok=false;
                        break;
                    }
                }
                if(ok){
                    dp[i+L]=Math.min(dp[i+L],dp[i]+rulecost1[j]);
                }
            }
        }
        return dp[n]==Integer.MAX_VALUE ? -1:dp[n];
    }
}
