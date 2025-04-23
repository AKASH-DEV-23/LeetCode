class Solution {
    public int countLargestGroup(int n) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=1;i<=n;i++){
            int sum=helper(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Integer,Integer>> com=new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2){
                if(e1.getValue()>e2.getValue())  return -1;
                else if(e1.getValue() < e2.getValue())  return 1;
                else    return 0;
            }
        };
        Collections.sort(list,com);
        Map<Integer,Integer> sorted=new LinkedHashMap<>();
        int maxi=list.get(0).getValue();
        int cnt=0;
        for(Map.Entry<Integer, Integer> mp:list){
            if(maxi==mp.getValue()) cnt++;
            else    return cnt;
            sorted.put(mp.getKey(),mp.getValue());
        }
        System.out.println(sorted);
        return cnt;
    }
    private int helper(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            sum+=rem;
        }
        return sum;
    }
}
