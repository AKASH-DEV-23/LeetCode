class Solution {
    public int minOperations(String s) {
        int zeroSt=0;
        int oneSt=0;
        for(int i=0;i<s.length();i++){
            int temp=s.charAt(i)-'0';
            if(i%2==0){
                if(temp==0){
                    oneSt++;
                }else{
                    zeroSt++;
                }
            }else{
                if(temp==0){
                    zeroSt++;
                }else{
                    oneSt++;
                }
            }
        }
        return Math.min(zeroSt,oneSt);
    }
}
