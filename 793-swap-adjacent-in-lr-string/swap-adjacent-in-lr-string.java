class Solution {
    public boolean canTransform(String start, String result) {
        int i=0;
        int j=0;
        int n=start.length();
        int m=n;
        char[] st=start.toCharArray();
        char[] res=result.toCharArray();
        while(i<n || j<m){
            while(i<n && st[i]=='X')    i++;
            while(j<m && res[j]=='X')    j++;
            if(i==n || j==m)    return i==n && j==m;
            if(st[i] != res[j])   return false;
            if(st[i]=='L' && i<j)   return false;
            if(st[i]=='R' && i>j)   return false;
            i++;
            j++;
        }
        return true;
    }
}