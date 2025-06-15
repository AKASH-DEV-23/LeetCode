class Solution {
public:
    int maxDiff(int num) {
        string str;
        while(num>0){
            str=to_string(num%10)+str;
            num/=10;
        }
        // int maxi=num;
        string maxi=str;
        for(int i=0;i<str.size();++i){
            for(char j='9';j>='0';--j){
              string curr=str;
                for(int k=0;k<str.size();++k){
                    if(str[k]==str[i]){
                        curr[k]=j;
                    }
                }
                maxi=max(maxi,curr);
            }
        }

        string mini=str;
        for(int i=0;i<str.size();++i){
            for(char j='0';j<='9';++j){
              string curr=str;
                for(int k=0;k<str.size();++k){
                    if(str[k]==str[i]){
                    if(k==0 && j=='0') break;
                        curr[k]=j;
                    }
                }
                mini=min(mini,curr);
            }
        }
        return stol(maxi)-stol(mini);
    }
};