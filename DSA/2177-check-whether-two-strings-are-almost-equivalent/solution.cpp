class Solution {
public:
    bool checkAlmostEquivalent(string word1, string word2) {
        map<char,int>mp;
        map<char,int>mp2;
        for(auto &i:word1) mp[i]++;
        for(auto &i:word2) mp2[i]++;
        for(auto &i:word1){
            int v1=mp[i];
            int v2=mp2[i];
            if(abs(v2-v1)>=4) return false;
        }
        for(auto &i:word2){
            int v1=mp[i];
            int v2=mp2[i];
            if(abs(v2-v1)>=4) return false;
        }
        return true;
    }
};
