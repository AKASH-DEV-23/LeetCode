class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        Map<Integer,List<Integer>> adj=new HashMap<>();
        for(int[] edge:invocations){
            int a=edge[0];
            int b=edge[1];
            if(!adj.containsKey(a))  adj.put(a,new ArrayList<>());
            adj.get(a).add(b);
        }

        Queue<Integer> q=new LinkedList<>();
        Boolean[] visited=new Boolean[n];
        q.offer(k);

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                int node=q.poll();
                if(visited[node]==null){
                    for(int suspiciousNode:adj.getOrDefault(node,new ArrayList<>())){
                        q.offer(suspiciousNode);
                    }
                }
                visited[node]=true;
            }
        }

        List<Integer> ans=new ArrayList<>();
        boolean isSafe=false;

        for(int sourceNode:adj.keySet()){
            if(visited[sourceNode]==null){
                for(int vNode:adj.get(sourceNode)){
                    if(visited[vNode]!=null) isSafe=true;
                }
            }
        }

        if(isSafe){
            for(int i=0;i<n;i++)    ans.add(i);
        }else{
            for(int i=0;i<n;i++){
                if(visited[i]==null)    ans.add(i);
            }
        }

        return ans;
    }
}
