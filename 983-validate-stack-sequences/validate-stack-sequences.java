class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        for(int i=popped.length-1; i>=0; i--)   st2.push(popped[i]);

        for(int num:pushed){
            st1.push(num);
            while(!st1.isEmpty() && st1.peek().equals(st2.peek())){
                st1.pop();
                st2.pop();
            }
        }
        return st1.isEmpty() && st2.isEmpty();
    }
}