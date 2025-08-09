class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> visi=new HashSet<>();
        for(int i=k;i<=s.length();i++){
            visi.add(s.substring(i-k,i));
        }
        if(visi.size()==Math.pow(2,k))  return true;
        return false;
    }
}
