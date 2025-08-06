class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
        Set<Character> visi=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(char ch:s.toCharArray()){
            if(visi.contains(ch))   sb.append(ch);
        }
        StringBuilder ans=new StringBuilder(s);
        // System.out.println(sb);
        sb.reverse();
        int idx=0;
        for(int i=0;i<ans.length();i++){
            if(visi.contains(ans.charAt(i))){
                ans.setCharAt(i,sb.charAt(idx++));
            }
        }
        return ans.toString();
    }
}
