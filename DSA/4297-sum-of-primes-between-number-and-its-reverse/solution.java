class Solution {
    public int sumOfPrimesInRange(int n) {
        StringBuilder sb =new StringBuilder(n+"");
        int rev=Integer.parseInt(sb.reverse().toString());
      //  System.out.println(n+" "+rev);
        int size=Math.max(n,rev);
        int min=Math.min(n,rev);
        boolean[] prime=new boolean[size+1];
    
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;

        for(int i=2;i<=Math.sqrt(size);i++){
            if(prime[i]){
                for(int j=i*i;j<=size;j+=i){
                    prime[j]=false;
                }
            }
        }
        //
int sum=0;
        for(int i=min;i<=size;i++){
            if(prime[i]){
                sum+=i;
            }
        }
        return sum;
    }
}
