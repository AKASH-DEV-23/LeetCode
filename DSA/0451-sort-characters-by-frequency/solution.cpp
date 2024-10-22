class Solution {
public:
    string frequencySort(string s) {
        map<char,int>mp;
        for(auto &i:s) mp[i]++;
        vector<pair<int,char>>vec;
        for(auto &i:mp){
           vec.push_back({i.second,i.first});
        }
        sort(begin(vec),end(vec),greater<>());
        string ans;
        for(auto &i:vec){
            int cnt=i.first;
            while(cnt--){
                ans+=i.second;
            }
        }
        return ans;
    }
};
