class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int j=arr.length-1;
        for(int i=0;i<j;i++){
            if(arr[i]-arr[j] !=0){
                if(arr[i]<arr[j]){
                    arr[j]=arr[i];
                }else{
                    arr[i]=arr[j];
                }
            }
            j--;
        }
        // System.out.println(Arrays.toString(arr));
        return new String(arr);
    }
}