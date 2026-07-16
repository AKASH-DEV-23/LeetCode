class Solution {
    public long gcdSum(int[] nums) {
        if(nums==null || nums.length==0)    return  0;
        int n=nums.length;

        int[] preMax=new int[n];
        preMax[0]=nums[0];

        for(int i=1;i<n;i++){
            preMax[i]=Math.max(preMax[i-1],nums[i]);
        }

        int[] preGCD=new int[n];

        for(int i=0;i<n;i++){
            preGCD[i]=findGCD(nums[i],preMax[i]);
        }

        Arrays.sort(preGCD);
        int i=0;
        int j=n-1;
        long sumGCD=0;
        while(i<j){
            sumGCD+=findGCD(preGCD[i],preGCD[j]);
            i++;
            j--;
        }
        return sumGCD;
    }

    private int findGCD(int a, int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}
