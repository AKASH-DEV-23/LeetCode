class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n=values.length;
        boolean[] visited=new boolean[n+1];
        long score=0;
        for(int i=0;i<n;){
            if(visited[i]){
                return score;
            }
            visited[i]=true;
            if(instructions[i].equals("add")){
                score+=values[i];
                i++;
            }else{
                i=i+values[i];
                if(i<0 || i>=n){
                    return score;
                }
            }
        }
        return score;
    }
}
