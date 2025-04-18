class Solution {
    public int[][] merge(int[][] nums) {
        List<int[]> list=new ArrayList<>();
        Comparator<int[]> com=new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0]<b[0])   return -1;
                else if(a[0]>b[0])  return 1;
                else    return 0;
            }
        };
        Arrays.sort(nums,com);
        int[] interval=nums[0];
        list.add(interval);
        for(int newInterval[]:nums ){
            if(interval[1]>=newInterval[0]){
                interval[1]=Math.max(interval[1],newInterval[1]);
            }else{
                interval=newInterval;
                list.add(interval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}