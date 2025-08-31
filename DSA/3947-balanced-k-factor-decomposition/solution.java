class Solution {
   private List<Integer> list;
   private int mini=Integer.MAX_VALUE;
    public int[] minDifference(int n, int k) {
        solve(new ArrayList<>(),n,k,1);
        int[] finalans=new int[k];
        for(int i=0;i<k;i++)  finalans[i]=list.get(i);
        return finalans;
    }
    private void solve( List<Integer> temp,int num,int cnt,int org){
        if(cnt==1){
            if(num>=org){
                temp.add(num);
                check(temp);
                temp.remove(temp.size()-1);
            }
            return;
        }
        for(int i=org;i<=num;i++){
            if(num%i==0){
                temp.add(i);
                solve(temp,num/i,cnt-1,i);
                temp.remove(temp.size()-1);
            }
        }
    }
    private void check(List<Integer> temp){
        int st=temp.get(0);
        int end=temp.get(0);
        for(int num:temp){
            st=Math.min(st,num);
            end=Math.max(end,num);
        }
        int gp=end-st;
        if(gp<mini){
            mini=gp;
            list=new ArrayList<>(temp);
        }
    }
}
