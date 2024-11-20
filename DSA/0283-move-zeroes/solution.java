class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        int len=arr.length;
        while(j<len){
            if(arr[i]!=0){
                i++;
                j++;
            } else{
                while( j < len && arr[j]==0){
                    j++;
                }
                if(j<len){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
    }
}
