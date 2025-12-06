class Solution {
    public boolean completePrime(int num) {
        String temp=num+"";
        int sum=0;
        for(char ch:temp.toCharArray()){
            sum=sum*10+ch-'0';
            if(!isPrime(sum))  return false;
        }
        sum=temp.charAt(temp.length()-1)-'0';
        int dec=10;
        if(!isPrime(sum))  return false;
        for(int i=temp.length()-2;i>=0;i--){
            sum=(temp.charAt(i)-'0') * dec + sum;
            dec*=10;
            if(!isPrime(sum))  return false;
        }
        return true;
        // boolean[] primes=seive();
        // String temp=num+"";
        // int sum=0;
        // for(char ch:temp.toCharArray()){
        //     sum=sum*10+ch-'0';
        //     if(!primes[sum])  return false;
        // }
        // sum=temp.charAt(temp.length()-1)-'0';
        // int dec=10;
        // if(!primes[sum])  return false;
        // for(int i=temp.length()-2;i>=0;i--){
        //     sum=(temp.charAt(i)-'0') * dec + sum;
        //     dec*=10;
        //     if(!primes[sum])  return false;
        // }
        // return true;
    }
    private boolean isPrime(int num){
        if(num<=1)  return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)  return false;
        }
        return  true;
    }
    private boolean[] seive(){
        int size=1000_000;
        boolean[] primes=new boolean[size+1];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        for(int i=2;i<=Math.sqrt(size);i++){
            if(primes[i]){
                for(int j=i*i;j<=size;j+=i){
                    primes[j]=false;
                }
            }
        }
        return primes;
    }
}
