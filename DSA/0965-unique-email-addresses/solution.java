class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> vis=new HashSet<>();
        for(String s:emails){
            String[] arr=s.split("@");
            // System.out.println(arr[0]+" "+arr[1]);
            vis.add(solve(arr));
        }
        // System.out.print(vis);
        return vis.size();
    }
    private String solve(String[] arr){
        StringBuilder sb=new StringBuilder();
        for(char ch:arr[0].toCharArray()){
            if(ch=='+')  break;
            if(ch=='.') continue;
            sb.append(ch);
        }
        sb.append("@");
        sb.append(arr[1]);
        return sb.toString();
    }
}
