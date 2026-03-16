class Solution {
    Set<Integer> visited;
    PriorityQueue<Integer> minpq;
    int row;
    int col;
    public int[] getBiggestThree(int[][] grid) {
        visited=new HashSet<>();
        minpq=new PriorityQueue<>();
        row=grid.length;
        col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                solve(grid,i,j);  
            }
        }

        if(minpq.size()==1)    return new int[]{minpq.poll()};
        int[] two=new int[2];
        if(minpq.size()==2){
            two[1]=minpq.poll();
            two[0]=minpq.poll();
            return two;
        }
        int[] three=new int[3];
        int idx=2;
        while(!minpq.isEmpty()){
            three[idx--]=minpq.poll();
            if(idx<0)   break;
        }
        return three;
        
    }

    private void solve(int[][] grid, int i, int j){
        if(!visited.contains(grid[i][j])){
            if(minpq.size()<3){
                minpq.offer(grid[i][j]);
            }else{
                if(minpq.peek()<grid[i][j]){
                    minpq.poll();
                    minpq.offer(grid[i][j]);
                }
            }
            visited.add(grid[i][j]);
        }
        int minLen=Math.min(row,col);
        for(int cnt=1;cnt<=minLen/2;cnt++){
            int[] top=new int[]{i,j};
            int[] bottom=new int[]{cnt*2+i,j};
            int[] left=new int[]{i+cnt,j-cnt};
            int[] right=new int[]{i+cnt,j+cnt};
            if(!isValid(top,bottom,left,right)){
                break;
            }else{
                calSum(grid,top,bottom,left,right,cnt);
            }
        }
    }

    private void calSum(int[][] grid, int[] top, int[] bottom, int[] left, int[] right, int cnt){
        int sum=0;
        sum+=grid[top[0]][top[1]];
        sum+=grid[left[0]][left[1]];
        sum+=grid[right[0]][right[1]];
        sum+=grid[bottom[0]][bottom[1]];

        for(int i=1;i<cnt;i++){
            int topi=top[0]+i;
            int topj=top[1]+i;
            int lefti=left[0]+i;
            int leftj=left[1]+i;
            if(topi==right[0] && topj==right[1])    break;
            if(lefti==bottom[0] && leftj==bottom[1])    break;
            sum+=grid[topi][topj];
            sum+=grid[lefti][leftj];
        }

        for(int i=1;i<cnt;i++){
            int topi=top[0]+i;
            int topj=top[1]-i;
            int righti=right[0]+i;
            int rightj=right[1]-i;
            if(topi==left[0] && topj==left[1])  break;
            if(righti==bottom[0] && rightj==bottom[1])  break;
            sum+=grid[topi][topj];
            sum+=grid[righti][rightj];
        }
        if(!visited.contains(sum)){
            if(minpq.size()<3){
                minpq.offer(sum);
            }else{
                if(minpq.peek()<sum){
                    minpq.poll();
                    minpq.offer(sum);
                }
            }
            visited.add(sum);
        }
    }

    private boolean isValid(int[] top, int[] bottom, int[] left, int[] right){
        if(left[0]>=row || left[1]<0)    return false;
        else if(bottom[0]>=row) return false;
        else if(right[0]>=row || right[1]>=col) return false;

        return true;
    }
}
