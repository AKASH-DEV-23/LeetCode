class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int i=0;
        for(String str:arr){
           arr[i++] = reverse(str);
        }
        // System.out.println(Arrays.toString(arr));
        String ans = String.join(" ",arr);
        return ans;
    }
    private String reverse(String word){
        char[] arr = word.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char ch = arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;
            j--;
        }
        return new String(arr);
    }
}