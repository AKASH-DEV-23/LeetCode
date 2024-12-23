class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        int num = s.length();
        int m = words.length;
        int w = words[0].length();
        HashMap<String,Integer> map = new HashMap<>();
        for(String x : words)
        map.put(x, map.getOrDefault(x,0)+1);
        for(int i=0; i<w; i++)
        {
            HashMap<String,Integer> temp = new HashMap<>();
            int c = 0;
            for(int j=i,k=i; j+w <= num; j=j+w)
            {
                String word = s.substring(j,j+w);
                temp.put(word,temp.getOrDefault(word,0)+1);
                c++;
                
                if(c==m)
                {
                    if(map.equals(temp))
                    {
                        answer.add(k);
                    }
                    String remove = s.substring(k,k+w);
                    temp.computeIfPresent(remove, (a, b) -> (b > 1) ? b - 1 : null);
                    c--;
                    k=k+w;
                }
            }
        }
        return answer;
    }
}
