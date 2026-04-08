class Solution {
    static List<Integer> alls;
    static{
        alls=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=1000;i++){
            for(int j=i;j<=1000;j++){
                map.merge(i*i*i+j*j*j,1,Integer::sum);
            }
        }
        for(int k:map.keySet()){
            if(map.get(k)>=2){
                alls.add(k);
            }
        }
        Collections.sort(alls);
    }
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> ans=new ArrayList<>();
        for(int num:alls){
            if(num<=n){
                ans.add(num);
            }else{
                break;
            }
        }
        return ans;
    }
}
