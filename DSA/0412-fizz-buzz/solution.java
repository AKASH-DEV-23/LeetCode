class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(solve(i));
        }
        return ans;
    }
    private String solve(int num){
        if(num%3==0 && num%5==0)    return "FizzBuzz";
        else if(num%3==0)   return "Fizz";
        else if(num%5==0)   return "Buzz";
        return num+"";
    }
}
