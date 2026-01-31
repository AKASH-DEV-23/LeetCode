class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char curr:letters){
            if(curr>target){
                return curr;
            }
        }
        return letters[0];
    }
}
