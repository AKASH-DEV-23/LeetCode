class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String,List<String>> map=new HashMap<>();
        map.put(beginWord,new ArrayList<>());
            for(String s2:wordList){
                map.put(s2,new ArrayList<>());
                if(isMatch(beginWord,s2)){
                    map.get(beginWord).add(s2);
                }
            }
        for(int i=0;i<wordList.size();i++){
            String s1=wordList.get(i);
            for(int j=0;j<wordList.size();j++){
                String s2=wordList.get(j);
                if(isMatch(s1,s2)){
                    map.get(s1).add(s2);
                }
            }
        }
        // System.out.println(map);
        return BFS(map,beginWord,endWord);
    }
    private int BFS(Map<String,List<String>> map, String beginWord, String endWord){
        Queue<String> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        q.offer(beginWord);
        set.add(beginWord);
        int cnt=1;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                String u=q.poll();
                for(String v:map.get(u)){
                    if(v.equals(endWord)){
                        cnt++;
                        return cnt;
                    }
                    if(!set.contains(v)){
                        q.offer(v);
                        set.add(v);
                    }
                }
            }
            cnt++;
        }
        return 0;
    } 
    private boolean isMatch(String s1, String s2){
        int i=0;
        int n=s1.length();
        int cnt=0;
        while(i<n){
            if(s1.charAt(i) != s2.charAt(i))     cnt++;
            i++;
        }
        return cnt==1 ? true : false;
    }
}
