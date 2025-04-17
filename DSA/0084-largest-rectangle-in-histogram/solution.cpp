class Solution {
public:
    vector<int> p(vector<int>& h){
        stack<int>st;
        vector<int>ans(h.size());
        for(int i=0;i<h.size();++i){
            while(!st.empty() && h[st.top()]>=h[i]){
                st.pop();
            }
            if(st.empty()) ans[i]=-1; //-1 
            else ans[i]=st.top(); // -1 -1 1
            st.push(i);// 1 // 5
        }
        return ans;
    }
    vector<int> n(vector<int>& h){
        stack<int>st;
        vector<int>ans(h.size());
        for(int i=h.size()-1;i>=0;--i){
            while(!st.empty() && h[st.top()]>h[i]){
                st.pop();
            }
            if(st.empty()) ans[i]=-1; //-1 
            else ans[i]=st.top(); // -1 -1 1
            st.push(i);// 1 // 5
        }
        return ans;
    }
    int largestRectangleArea(vector<int>& h) {
        vector<int>pre=p(h);
        vector<int>nex=n(h);
         int ans=INT_MIN;
         for(int i=0;i<h.size();++i){
            if(nex[i]==-1) nex[i]=h.size();
            int area=nex[i]-pre[i]-1;
            int total=h[i]*area;
            ans=max(ans,total);
         }
         return ans;
    }
};
