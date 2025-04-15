class Solution {
    Comparator<Integer> com=new Comparator<Integer>(){
        public int compare(Integer n1, Integer n2){
            String s1=n1.toString();
            String s2=n2.toString();
            return (s2+s1).compareTo(s1+s2);
        }
    };
    public String largestNumber(int[] nums) {
        Integer[] arr=new Integer[nums.length];
        int i=0;
        for(int num:nums){
            arr[i++]=num;
        }
        Arrays.sort(arr,com);
        System.out.print(Arrays.toString(arr));
        String ans="";
        for(Integer num:arr){
            ans+=num;
        }
        if(ans.charAt(0)=='0')  return "0";
        return ans;
    }
}
