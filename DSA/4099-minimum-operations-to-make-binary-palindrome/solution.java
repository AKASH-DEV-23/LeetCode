class Solution {
    public int[] minOperations(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=5000;i++){
            String temp=binary(i);
            boolean res=isPalindrome(temp);
            if(res) list.add(i);
        }
        // System.out.print(list);
        int size=nums.length;
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            int minDiff=nearestPalindrome(nums[i],list);
            ans[i]=minDiff;
        }
        return ans;
    }
    private int nearestPalindrome(int num,List<Integer> list){
        int min=Integer.MAX_VALUE;
        for(int temp:list){
            min=Math.min(min,Math.abs(temp-num));
        }
        return min;
    }
    private boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
    private String binary(int num){
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            int rem=num%2;
            num=num/2;
            sb.append(rem);
        }
        return sb.reverse().toString();
    }
}
