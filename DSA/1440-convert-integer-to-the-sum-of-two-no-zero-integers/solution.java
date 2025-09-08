class Solution {
    public int[] getNoZeroIntegers(int n) {
        int cnt=0;
        for(int i=n;i>=1;i--){
            if(i+cnt==n && check(i,cnt))    return new int[]{i,cnt};
            cnt++;
        }
        return new int[]{-1};
    }
    private boolean check(int num1, int num2){
        String s1=String.valueOf(num1);
        String s2=String.valueOf(num2);
        for(char ch:s1.toCharArray()){
            if(ch=='0') return false;
        }
        for(char ch:s2.toCharArray()){
            if(ch=='0') return false;
        }
        return true;
    }
}
