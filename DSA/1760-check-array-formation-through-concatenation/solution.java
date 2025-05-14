class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int len1=arr.length;
        for(int[] piece:pieces){
            int k=0;
            boolean flag=false;
            for(int num:piece){
                
                if(flag && (k>=len1 || arr[k]!=num))  return false;
                
                for(int i=0;i<len1;i++){
                    if(arr[i]==num && piece.length==1){
                        flag=true;
                        continue;
                    }
                    if(arr[i]==num){
                        k=i+1;
                        flag=true;
                        break;
                    }
                }
                if(!flag)   return false;
                
            }
        }
        return true;
    }
}
