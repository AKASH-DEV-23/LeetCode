class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int n1=g.length;
        int n2=s.length;
        int cnt=0;
        while(i<n1 && j<n2){
            if(g[i]<=s[j]){
                cnt++;
                i++;
            }                  
            j++;
        }
        return cnt;
    }
}
