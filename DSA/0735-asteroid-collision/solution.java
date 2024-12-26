class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int num : asteroids) {
            boolean exploded = false;
            while (!stack.isEmpty() && stack.peek() > 0 && num < 0) {
                if (Math.abs(stack.peek()) < Math.abs(num)) {
                    stack.pop();
                } else if (Math.abs(stack.peek()) == Math.abs(num)) {
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    exploded = true;
                    break;
                }
            }
            if (!exploded) {
                stack.push(num);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}

