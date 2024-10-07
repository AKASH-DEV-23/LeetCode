class Solution {
public:
    int minLength(string s) {
        int lenght=0;
        while(s.find("AB")!=string::npos || s.find("CD")!=string::npos){
            int idx=s.find("AB");
            if(idx!=string::npos) {
                s.erase(idx,2);
            }
            int idx2=s.find("CD");
            if(idx2!=string::npos){
                s.erase(idx2,2);
            }
           cout<<idx<<" \n";
           
        }
        cout<<s<<" \n";
        return s.size();
    }
};
