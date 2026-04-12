class Solution {
    static boolean[] primes;
    static List<Integer> allPrimes;
    static int[] seive;
    static{
        primes=new boolean[100010];
        allPrimes=new ArrayList<>();
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        for(int i=2;i<=Math.sqrt(100010);i++){
            if(primes[i]){
                for(int j=i*i;j<100010;j+=i){
                    primes[j]=false;
                }
            }
        }
        for(int i=0;i<100010;i++){
            if(primes[i]){
                allPrimes.add(i);
            }
        }
        int idx=0;
        seive=new int[allPrimes.size()];
        for(int num:allPrimes){
            seive[idx++]=num;
        }
    }
    public int minOperations(int[] nums) {
        int len=nums.length;
        int operations=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                if(!primes[nums[i]]){
                    int nextPrime=findPrime(nums[i]);
                    operations+=(nextPrime-nums[i]);
                }
            }else {
                if(primes[nums[i]]){
                    if(nums[i]==2){
                        operations+=2;
                    }else{
                        operations+=1;
                    }
            }   }
        }
        return operations;
    }

    private int findPrime(int num){
        int low=0;
        int high=seive.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(seive[mid]<=num)  low=mid+1;
            else  high=mid;
        }
        return seive[low];
    }
}
