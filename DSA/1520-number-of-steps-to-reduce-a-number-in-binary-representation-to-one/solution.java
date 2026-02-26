class Solution {
    public int numSteps(String s) {
        if(s.length()==1){
            return 0;
        }
        System.out.println(s);
        int ans=0;
        if(s.charAt(s.length()-1)=='0'){
            ans+=1+numSteps(s.substring(0,s.length()-1));
        }else{
            StringBuilder sb=new StringBuilder();
            int i;
            for(i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='1'){
                    sb.append('0');
                }else{
                    break;
                }
            }
            sb.append('1');
            i--;
            while(i>=0){
                sb.append(s.charAt(i));
                i--;
            }
            ans+=1+numSteps(sb.reverse().toString());
        }
        return ans;
    }
}
