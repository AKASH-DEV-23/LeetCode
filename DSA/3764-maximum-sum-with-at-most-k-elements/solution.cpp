class Solution {
public:
    long long maxSum(vector<vector<int>>& grid, vector<int>& limits, int k) {
       priority_queue<int>pq;
       for(int i=0;i<grid.size();++i){
        vector<int>res=grid[i];
        sort(begin(res),end(res));reverse(begin(res),end(res));
          int t=limits[i];
          int j=0;
          while(t--) pq.push(res[j++]);
       }
       long long sum=0;
       while(k--){
        sum+=pq.top();
        pq.pop();
       }
       return sum;
    }
};
