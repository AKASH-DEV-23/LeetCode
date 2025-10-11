class Solution {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[0]<b[0]){
                    return -1;
                }else if(a[0]>b[0]){
                    return 1;
                }else{
                    return 0;
                }
            }
        };
        Arrays.sort(intervals,com);
        int st=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> list=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }else{
                list.add(new int[]{st,end});
                st=intervals[i][0];
                end=intervals[i][1];
            }
        }
        list.add(new int[]{st,end});
        int idx=0;
        int[][] ans=new int[list.size()][2];
        for(int[] temp:list){
            ans[idx][0]=temp[0];
            ans[idx++][1]=temp[1];
        }
        return ans;
    }
}
