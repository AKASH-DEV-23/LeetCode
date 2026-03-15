class Solution {
    public long countCommas(long n) {
        long arr[]=new long[17];
        long prev=1000;
        long next=10000;
        arr[4]=0;
        for(int i=5;i<=16;i++){
            long diff=(long)next-prev;
            long comma=(i-2)/3;
            arr[i]=arr[i-1]+diff*comma;
            prev=next;
            next=(long)next*10;
        }
        System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder(n+"");
        long ans=0;
        int len=sb.length();
        ans+=arr[len];
        StringBuilder old=new StringBuilder("1");
        while(old.length()!=len){
            old.append("0");
        }
        long prevv=Long.parseLong(old.toString());
        if(n>=prevv){
            long comma=(len-1)/3;
                ans+=(n-prevv+1)*comma;
        }
        return ans;
    }
}
