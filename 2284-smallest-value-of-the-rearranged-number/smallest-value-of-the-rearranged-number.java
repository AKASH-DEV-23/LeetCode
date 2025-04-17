class Solution {
    public long smallestNumber(long num) {
        if(num==0) return 0;
        ArrayList<Character>arr=new ArrayList<>();
        long n=num;
        String st=num+"";
        for(char ch:st.toCharArray()){
            if(ch!='-')
             arr.add(ch);
        } 
        Collections.sort(arr);
        if(n<0){
            String res="";
            for(int i=arr.size()-1;i>=0;--i){
                res+=arr.get(i);
            }
            long ans=Long.parseLong(res);
            
            return -1*ans;
        }// 013
        int zero=0;
        for(char navya:arr) if(navya=='0') zero++;
        String res="";
        for(char navya:arr)  res+=navya;
        if(zero==0) return Long.parseLong(res);
        String ans="";
       int k =zero;
        ans+=res.charAt(zero);
      while(zero-->0) ans+='0';//10
      for(int i=k+1;i<res.length();++i){
         ans+=res.charAt(i);
      }
      return Long.parseLong(ans);
    }
}