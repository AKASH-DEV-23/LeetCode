class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> vis=new HashSet<>();
        for(int num:nums){
            for(int i=2;i<=num;i++){
                if(num%i==0 && isPrime(i))  vis.add(i);    
            }
        }
        return vis.size();
    }
    private boolean isPrime(int num){
        if(num<=1)  return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)    return false;
        }
        return true;
    }
}
