class Solution {
    public long sumOfLargestPrimes(String s){
        Set<Long> set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str=s.substring(i,j);
                str=helper(str);
                if(str.isEmpty())   continue;
                long num=Long.parseLong(str);
                if(check(num))set.add(num);
            }
        }
        List<Long> list=new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        long ans=0;
        int count=Math.min(3,list.size());
        for(int i=0;i<count;i++)
            ans+=list.get(i);
        return ans;
    }
    private String helper(String s){
        int i=0;
        while(i<s.length()&&s.charAt(i)=='0')i++;
        return s.substring(i);
    }
    private boolean check(long num){
        if(num<=1)return false;
        if(num==2)return true;
        if(num%2==0)return false;
        for(long i=3;i*i<=num;i+=2){
            if(num%i==0)return false;
        }
        return true;
    }
}

