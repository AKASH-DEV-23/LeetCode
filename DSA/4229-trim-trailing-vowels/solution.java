class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
        Set<Character> vis=new HashSet<>();
        vis.add('a');
        vis.add('e');
        vis.add('i');
        vis.add('o');
        vis.add('u');
        int i;
        for(i=s.length()-1;i>=0;i--){
            if(!vis.contains(s.charAt(i))){
                break;
            }
        }
        while(i>=0){
            sb.append(s.charAt(i--));
        }
        return sb.reverse().toString();
    }
}
