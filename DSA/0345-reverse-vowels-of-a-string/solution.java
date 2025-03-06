class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int j=arr.length-1;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<=j;i++){
            char ch = arr[i];
            if(ch-'a'==0 || ch-'e'==0 || ch-'i'==0 || ch-'o'==0 || ch-'u'==0 || ch-'A'==0 
            || ch-'E'==0 || ch-'I'==0 || ch-'O'==0 || ch-'U'==0){
                str.append(ch);
            }
        }
        j=0;
        for(int i=arr.length-1;i>=0;i--){
            char ch = arr[i];
            if(ch-'a'==0 || ch-'e'==0 || ch-'i'==0 || ch-'o'==0 || ch-'u'==0 || ch-'A'==0 
            || ch-'E'==0 || ch-'I'==0 || ch-'O'==0 || ch-'U'==0){
                arr[i]=str.charAt(j++);
            }
        }
        // System.out.println(Arrays.toString(arr));
        return new String(arr);
    }
}
