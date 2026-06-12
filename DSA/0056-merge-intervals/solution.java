class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0] ? Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0]));

        // System.out.println(Arrays.deepToString(intervals));
        List<int[]> mergeList=new ArrayList<>();
        
        int[] prev=intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] current=intervals[i];
            if(prev[1]>=current[0]){
                prev[1]=Math.max(prev[1],current[1]);
            }else{
                mergeList.add(prev);
                prev=current;
            }
        }
        mergeList.add(prev);
        return mergeList.toArray(new int[mergeList.size()][]);
    }
}
