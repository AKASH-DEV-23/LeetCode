class Solution {
    public String sortVowels(String s) {
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        Set<Character> vis=new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        for(char ch:s.toCharArray()){
            if(vis.contains(ch))    sb.append(ch);
        }
        int[] capi=new int[26];
        StringBuilder ans=new StringBuilder();
        for(char ch:sb.toString().toCharArray())
            if(ch>='A' && ch<='Z')  capi[ch-'A']++;
        for(int i=0;i<26;i++){
            int tmp=capi[i];
            while(tmp-- >0){
                ans.append((char)('A'+i));
            }
        }
        int[] small=new int[26];
        for(char ch:sb.toString().toCharArray())
            if(ch>='a' && ch<='z')  small[ch-'a']++;
        for(int i=0;i<26;i++){
            int tmp=small[i];
            while(tmp-- >0){
                ans.append((char)('a'+i));
            }
        }
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(vis.contains(arr[i])){
                arr[i]=ans.charAt(idx++);
            }
        }
        return new String(arr);
    }
}