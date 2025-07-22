class Solution {
    Set<Integer> set1=new HashSet<>();
    public boolean isHappy(int n) {
        if(n==1)    return true;
        if(set1.contains(n))    return false;
        set1.add(n);
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
       return isHappy(sum);
    }
}
