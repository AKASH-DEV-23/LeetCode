class Solution {
    public int countGoodSubstrings(String s) {
        int cnt=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<=arr.length-3;i++){
            Set<Character> set = new HashSet<>();
            boolean flag=true;
            for(int j=i;j<=i+2;j++){
                if(!set.contains(arr[j])){
                    set.add(arr[j]);
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag)    cnt++;
        }
        return cnt;
    }
}