class Solution {
    Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        return check(n);
    }
    private boolean check(int num){
        if(num==1)  return true;
        if(set.contains(num))   return false;
        set.add(num);
        int sum=0;
        while(num>0){
            int rem=num%10;
            num/=10;
            rem=rem*rem;
            sum+=rem;
        }
        return check(sum);
    }
}
