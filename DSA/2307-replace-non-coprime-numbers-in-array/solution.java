class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int num:nums){
            if(!st.isEmpty() && GCD(st.peek(),num)>1){
                int currLCM=LCM(st.pop(),num);
                while(!st.isEmpty() && GCD(currLCM,st.peek())>1) currLCM=LCM(st.pop(),currLCM);
                st.push(currLCM);
            }else{
                st.push(num);
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
    private int GCD(int a, int b){
        if(b==0)    return a;
        return GCD(b,a%b);
    }
    private int LCM(int a, int b){
        return a*(b/GCD(a,b));
    }
}
