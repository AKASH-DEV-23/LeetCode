class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len=words.length;
        int[] prefix=new int[len];
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        if(set.contains(words[0].charAt(0)) && 
        set.contains(words[0].charAt(words[0].length()-1))){
            prefix[0]+=1;
        }
        for(int i=1;i<len;i++){
            String s=words[i];
            if(set.contains(s.charAt(0)) && set.contains(s.charAt(s.length()-1))){
                prefix[i]=prefix[i-1]+1;
            }else{
                prefix[i]=prefix[i-1];
            }
        }
        System.out.print(Arrays.toString(prefix));
        int[] ans=new int[queries.length];
        int i=0;
        for(int[] query:queries){
            int left=query[0];
            int right=query[1];
            if(left==0) ans[i++]=prefix[right];
            else ans[i++]=prefix[right]-prefix[left-1];
        }
        return ans;
    }
}
