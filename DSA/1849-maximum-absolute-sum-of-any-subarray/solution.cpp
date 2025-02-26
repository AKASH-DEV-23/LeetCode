class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        int sum=0;
        int maxi=INT_MIN;
        int sum2=0;
        int mini=INT_MAX;
        for(int i=0;i<nums.size();++i){
           sum=max(sum+nums[i],nums[i]);
           sum2=min(sum2+nums[i],nums[i]);
            mini=min(mini,sum2);
            maxi=max(maxi,sum);
        }
        return max(abs(maxi),abs(mini));
    }
};
