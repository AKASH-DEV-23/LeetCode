class Solution {
    public int mirrorReflection(int p, int q) {
        int g=GCD(p,q);
        p/=g;
        q/=g;
        if(p%2==0 && q%2==1)    return 2;
        if(p%2==1 && q%2==1)    return 1;
        return 0;
    }
    private int GCD(int a, int b){
        if(b==0)    return a;
        return GCD(b,a%b);
    }
}
