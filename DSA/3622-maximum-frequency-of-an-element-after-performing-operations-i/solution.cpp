class Solution {
public:
    int maxFrequency(vector<int>& nums, int k, int numOperations) {
        // 5 15 20 20 
        sort(nums.begin(),nums.end());
        map<int,int>mp;
        for(auto &i:nums) mp[i]++;
        if(numOperations==0){
            int maxi=0;
            for(auto&i:mp){
                maxi=max(maxi,i.second);
            }
            return maxi;
        }
        int maxirange= -1e9;
        int minrange=1e9;
        int last=nums[nums.size()-1];
        unordered_map<int,int>pre;
        for(auto &i:nums){
            int left=i-k;
            int right=i+k;
            minrange=min(minrange,left);
            maxirange=max(maxirange,right);
            pre[left]++;
            pre[right+1]--;
        }
        // vector<int>prefix(pre.size());
        // prefix[0]=pre[0];
        for(int i=minrange;i<=maxirange;i++){
            pre[i]+=pre[i-1];
        }
        int maxi=0;
       for(int i=minrange;i<=maxirange;i++){
          if(pre[i]>0){
            int freq=pre[i];
            if(mp.find(i)!=mp.end()){
                int check=mp[i];
                int left=abs(freq-check); // 3-2 // 1
                int ans=min(left,numOperations); // 1
                maxi=max(maxi,check+ans);
            }else{
                int ans=min(numOperations,freq);
                maxi=max(maxi,ans);
            }
          }
       }
       return maxi;
    }
};
