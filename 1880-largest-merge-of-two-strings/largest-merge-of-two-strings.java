class Solution {
    int l1;
    int l2;
    public String largestMerge(String word1, String word2) {
        l1=word1.length();
        l2=word2.length();
        int i=0;
        int j=0;
        StringBuilder str= new StringBuilder();
        while(i<l1 && j<l2){
            if(word1.charAt(i)>word2.charAt(j)){
                str.append(word1.charAt(i));
                i++;
            }else if(word1.charAt(i) < word2.charAt(j)){
                str.append(word2.charAt(j));
                j++;
            }else{
                int ans=check(word1, word2, i, j);
                if(ans == 0){
                    str.append(word1.charAt(i));
                    i++;
                } else {
                    str.append(word2.charAt(j));
                    j++;
                }    
            }
        }
        while(i<l1){
            str.append(word1.charAt(i));
            i++;
        }
        while(j<l2){
            str.append(word2.charAt(j));
            j++;
        }
        return str.toString();
    }

    private int check(String s1, String s2, int i, int j){
        while(i<l1 && j<l2){
            if(s1.charAt(i) > s2.charAt(j)){
                return 0;
            }else if(s1.charAt(i) < s2.charAt(j)){
                return 1;
            }
            i++;
            j++;
        }
        if(i==l1)   return 1;
        if(i==l1 && j==l2)  return 0;
        return 0;
    }
}