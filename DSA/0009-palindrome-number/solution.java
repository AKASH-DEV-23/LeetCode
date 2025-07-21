class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        StringBuilder sb=new StringBuilder();
        String s=x+"";
        sb.append(s);
        sb.reverse();
        // System.out.println(sb+" "+s);
       return  Long.parseLong(s)==Long.parseLong(sb.toString());
    }
}
