class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int[] suffix=new int[n];
        int[] prefix=new int[n];
        for(int i=0;i<n;i++){
            char ch=customers.charAt(i);
            if(i==0){
                if(ch=='N') prefix[i]=1;
            } 
            else if(ch=='N') prefix[i]=prefix[i-1]+1;
            else    prefix[i]=prefix[i-1];
        }
        for(int i=n-1;i>=0;i--){
            char ch=customers.charAt(i);
            if(i==n-1){
                if(ch=='Y') suffix[i]=1;
            }   
            else if(ch=='Y')   suffix[i]=suffix[i+1]+1;
            else    suffix[i]=suffix[i+1];
        }
        int maxPenalty=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<n;i++){
            int yes=suffix[i];
            int no=0;
            if(i!=0) no=prefix[i-1];
            if(maxPenalty>(yes+no)){
                maxPenalty=yes+no;
                idx=i;
            }
        }
        int no=prefix[n-1];
        if(maxPenalty>no){
            return n;
        }
        return idx;
    }
}
