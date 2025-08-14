class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> lst=new ArrayList<>();
        boolean[] primes=seive(right);
        for(int i=left;i<=right;i++){
            if(primes[i])  lst.add(i);
        }
        System.out.print(lst);
        int[] ans={-1,-1};
        int minDiff=Integer.MAX_VALUE;
        for(int i=lst.size()-1;i>=1;i--){
            int diff=lst.get(i)-lst.get(i-1);
            if(diff<=minDiff){
                ans=new int[]{lst.get(i-1),lst.get(i)};
                minDiff=diff;
            }  
        }
        return ans;
    }
    private boolean isPrime(int num){
        if(num<=1)  return false;
        for(int i=2;i<=num/2;i++)   if(num%i==0)    return false;
        return true;
    }
    private boolean[] seive(int n){
        boolean[] primes=new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(primes[i]){
                for(int j=i*i;j<=n;j+=i){
                    primes[j]=false;
                }
            }
        }
        return primes;
    }
}