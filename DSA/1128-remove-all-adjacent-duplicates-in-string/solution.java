class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> myStack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!myStack.isEmpty() && myStack.peek()==ch)    myStack.pop();
            else   myStack.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!myStack.isEmpty())  sb.append(myStack.pop());
        return sb.reverse().toString();
    }
}
