class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        while(sb.length()<k){
            StringBuilder temp=new StringBuilder();
            for(char ch:sb.toString().toCharArray()){
                String s=((char)(ch+1))+"";
                temp.append(s);
            }
            sb.append(temp);
        }
        k=k-1;
        System.out.print(sb);
        return sb.charAt(k);
    }
}
