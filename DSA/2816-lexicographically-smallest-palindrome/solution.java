class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]==arr[r]){
                
            }else if(arr[l]<arr[r]){
                arr[r]=arr[l];
            }else{
                arr[l]=arr[r];
            }
            l++;
            r--;
        }
        return new String(arr);
    }
}
