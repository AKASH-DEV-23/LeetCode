class Solution {
    public int minJumps(int[] arr) {
        if(arr.length==1)   return 0;
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }

        boolean[] visited=new boolean[arr.length];

        Queue<Integer> q=new LinkedList<>();

        q.offer(0);
        visited[0]=true;
        int steps=0;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                if(curr==arr.length-1)    return steps;
                int prev=curr-1;
                int next=curr+1;
                if(prev>0 && !visited[prev]){
                    q.offer(prev);
                    visited[prev]=true;
                }
                if(next<arr.length && !visited[next]){
                    q.offer(next);
                    visited[next]=true;
                }
                if(mp.containsKey(arr[curr])){
                    for(int val:mp.get(arr[curr])){
                        if(!visited[val]){
                            q.offer(val);
                            visited[val]=true;
                        }
                    }
                    mp.remove(arr[curr]);
                }
            }
            steps++;
        }

        return -1;
    }
}
