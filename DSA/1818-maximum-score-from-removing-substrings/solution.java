class Solution {
    public int maximumGain(String s, int x, int y) {
        int points=0;
        if(x>y){
            Stack<Character> st1=new Stack<>();
            for(char ch:s.toCharArray()){
                if(!st1.isEmpty() && st1.peek()=='a' && ch=='b'){
                    st1.pop();
                    points+=x;
                }else{
                    st1.push(ch);
                }
            }
            StringBuilder sb=new StringBuilder();
            while(!st1.isEmpty()){
                sb.append(st1.pop());
            }
            sb.reverse();
            String temp=sb.toString();
            for(char ch:temp.toCharArray()){
                if(!st1.isEmpty() && st1.peek()=='b' && ch=='a'){
                    st1.pop();
                    points+=y;
                }else{
                    st1.push(ch);
                }
            }
        }else{
            Stack<Character> st2=new Stack<>();
            for(char ch:s.toCharArray()){
                if(!st2.isEmpty() && st2.peek()=='b' && ch=='a'){
                    st2.pop();
                    points+=y;
                }else{
                    st2.push(ch);
                }
            }
            StringBuilder sb=new StringBuilder();
            while(!st2.isEmpty()){
                sb.append(st2.pop());
            }
            sb.reverse();
            String temp=sb.toString();
            for(char ch:temp.toCharArray()){
                if(!st2.isEmpty() && st2.peek()=='a' && ch=='b'){
                    st2.pop();
                    points+=x;
                }else{
                    st2.push(ch);
                }
            }
        }
        return points;
    }
}
