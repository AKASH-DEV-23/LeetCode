class Solution {
public:
    bool hasSameDigits(string s) {
        string t=s;
        while(true){
            map<int,int>mp;
            int i=0;
            string ans;
            while(i<t.size()-1){
                int a=t[i]-'0';
                int b=t[i+1]-'0';
                ans+=to_string((a+b)%10);
                mp[(a+b)%10]++;
                i++;
            }
            if(mp.size()==1 && ans.size()>=2) return true;
            if(t.size()==1) break;
            t=ans;
        }
        return false;
    }
};