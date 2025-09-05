class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> vis=new HashSet<>();
        for(int num:arr1){
            String s=String.valueOf(num);
            for(int i=1;i<=s.length();i++)  vis.add(s.substring(0,i));
        }
        int max=0;
        for(int num:arr2){
            String s=String.valueOf(num);
            for(int i=s.length();i>0;i--){
                if(vis.contains(s.substring(0,i))){
                    max=Math.max(max,i);
                    break;
                }
            }
        }
        return max;
    }
}
