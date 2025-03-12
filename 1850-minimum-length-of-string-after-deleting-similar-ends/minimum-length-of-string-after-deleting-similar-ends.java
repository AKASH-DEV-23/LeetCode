class Solution {
    public int minimumLength(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char ch=arr[i];
            if(ch==arr[j]){
                while( i<=j && arr[i]==ch)   i++;
                while(i<=j && arr[j]==ch)   j--;
            }else{
                return j-i+1;
            }
        }
        if(i<=j)    return j-i+1;
        return 0;
    }
}