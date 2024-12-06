class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<=n;i++){
            set.add(i);
        }

        for(int num:banned){
            if(set.contains(num)){
                set.remove(num);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int num:set){
            list.add(num);
        }

        // System.out.print(list);
        Collections.sort(list);

        int cnt=0;
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
            // System.out.print(sum+" ");
            if(sum<=maxSum){
                cnt++;
            }else{
                return cnt;
            }
        }
        return cnt;
    }
}
