class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st1=new Stack<>();
        int i=0;
        for(int num:pushed){
            st1.push(num);
            while(!st1.isEmpty() && st1.peek() == popped[i]){
                st1.pop();
                i++;
            }
        }
        return st1.isEmpty();
    }
}
