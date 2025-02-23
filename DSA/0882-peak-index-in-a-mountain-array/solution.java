class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1] < arr[mid])    return mid;
            else if(arr[mid-1]<arr[mid])    st=mid;
            else    end=mid;
        }
        return -1;
    }
}
