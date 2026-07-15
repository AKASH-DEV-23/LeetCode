class Solution {
    private static int[] sumOdd;
    private static int[] sumEven;
    static{
        sumOdd=new int[1001];
        sumEven=new int[1001];
        sumOdd[0]=1;
        sumEven[0]=2;
        int num=3;
        for(int i=1;i<=1000;i++){
            sumOdd[i]=sumOdd[i-1]+num;
            num+=2;
        }
        num=4;
        for(int i=1;i<=1000;i++){
            sumEven[i]=sumEven[i-1]+num;
            num+=2;
        }
    }
    public int gcdOfOddEvenSums(int n) {
        // return gcd(sumOdd[n-1],sumEven[n-1]);
        return n;
    }

    private int gcd(int a, int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}
