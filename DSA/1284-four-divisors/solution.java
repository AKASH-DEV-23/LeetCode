class Solution {
    public int sumFourDivisors(int[] nums) {
        int result=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            if(mp.containsKey(num)){
                result+=mp.get(num);
            }else{
                int sum=checkDivisors(num);
                mp.put(num,sum);
                result+=sum;
            }
        }
        return result;
    }
    private int checkDivisors(int num){
        int ans=0;
        int cnt=0;
        int sqrt=(int)Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
            if(num%i==0){
                int j=num/i;
                if(i==j){
                    ans+=i;
                    cnt++;
                }    
                else{
                    cnt+=2;
                    ans+=i+j;
                }
            }
        }
        return cnt==4?ans:0;
    }
}
