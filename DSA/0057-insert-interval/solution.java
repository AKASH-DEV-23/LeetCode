class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergeList=new ArrayList<>(Arrays.asList(intervals));
        mergeList.add(newInterval);
        Collections.sort(mergeList,(a,b)-> a[0]==b[0] ? Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0]));

        int[] prev=mergeList.get(0);
        List<int[]> result=new ArrayList<>();

        for(int i=1;i<mergeList.size();i++){
            int[] current=mergeList.get(i);
            if(prev[1]>=current[0]){
                prev[1]=Math.max(prev[1],current[1]);
            }else{
                result.add(prev);
                prev=current;
            }
        }

        result.add(prev);
        return result.toArray(new int[0][]);
    }
}
