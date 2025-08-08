class Solution {
    public int findComplement(int num) {
        return binary(num);
    }
    private int binary(int num){
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            sb.append(num%2==0?1:0);
            num/=2;
        }
        int sum=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                sum+=Math.pow(2,i);
            }
        }
        return sum;
    }
}
