class Solution {
    public int evalRPN(String[] tokens) {
        int[] a = new int[tokens.length];
        int top = -1;
        int temp = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                        temp = a[top - 1] + a[top];
                        a[--top] = temp;
                        break;
                case "-":
                        temp = a[top - 1] - a[top];
                        a[--top] = temp;
                        break;
                case "*":
                        temp = a[top - 1] * a[top];
                        a[--top] = temp;
                         break;
                case "/":
                        temp = a[top - 1] / a[top];
                        a[--top] = temp;
                        break;
                default:    
                        a[++top] = Integer.valueOf(s);
            }
        }
        return a[0];
    }
}
