class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        int idx=0;

        for(int num:nums){
            String binary=Integer.toBinaryString(num);
            String newBinary=invertBit(binary);
            int bin=Integer.parseInt(newBinary,2);
            if((bin | bin+1)==num){
                ans[idx++]=bin;
            }else{
                ans[idx++]=-1;
            }
        }

        return ans;
    }

    private String invertBit(String binary){
        StringBuilder sb=new StringBuilder(binary);
        int n=sb.length();

        if(sb.charAt(n-1)=='0'){
            sb.setCharAt(n-1,'1');
            return sb.toString();
        }

        for(int i=n-2; i>=0; i--){
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i+1,'0');
                return sb.toString();
            }
        }

        sb.setCharAt(0,'0');
        return sb.toString();
    }
}
