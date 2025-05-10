class Solution {
public:
void dfs(vector<bool>&vis,int u,vector<vector<int>>&stones){
    vis[u]=true;
    for(int i=0;i<stones.size();++i){
        int row=stones[u][0];
        int col=stones[u][1];
        if(!vis[i]){
        if(row==stones[i][0] || stones[i][1]==col){
            dfs(vis,i,stones);
        }
        }
    }
}
    int removeStones(vector<vector<int>>& stones) {
        vector<bool>vis(stones.size(),false);
        int cnt=0;
        for(int i=0;i<stones.size();++i){
            if(!vis[i]){
                dfs(vis,i,stones);
                cnt++;
            }
        }
        return stones.size()-cnt;
    }
};
