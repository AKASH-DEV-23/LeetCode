class Solution {
    public double average(int[] salary) {
        int min=salary[0];
        int max=salary[0];
        int minIdx=0;
        int maxIdx=0;
        for(int i=0;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
                minIdx=i;
            }

            if(max<salary[i]){
                max=salary[i];
                maxIdx=i;
            }
        }
        
        double ans=0;
        int cnt=0;
        for(int i=0;i<salary.length;i++){
            if(i==minIdx || i==maxIdx){
                continue;
            }
            ans+=salary[i];
            cnt++;

        }
        return ans/cnt;
    }
}
