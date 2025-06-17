class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<V;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].length;j++){
                map.get(i).add(graph[i][j]);
            }
        }
        // System.out.println(map);
        Set<Integer> set=new HashSet<>();
        for(int key:map.keySet()){
            List<Integer> temp=map.get(key);
            if(temp.size()==0)  set.add(key);
        }
        boolean change=true;
        while(change){
            change=false;
            for(int key:map.keySet()){
                if(set.contains(key))   continue;
                boolean flag=true;
                for(int v:map.get(key)){
                    if(!set.contains(v)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    set.add(key);
                    change=true;
                }
            }

        }
        List<Integer> list=new ArrayList<>();
        for(int num:set){
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}
