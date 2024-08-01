class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
           int eleven = s.charAt(11) - '0';
           int twel = s.charAt(12) - '0';
           int age = eleven * 10 + twel;
            if(age > 60){
                count++;
            }
        }
        return count;
    }
}
