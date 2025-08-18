class Solution {
    public int minGroups(int[][] intervals) {
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[0]>b[0])   return 1;
                else if(a[0]<b[0])  return -1;
                else{
                    if(a[1]<b[1])   return -1;
                    else if(a[1]>b[1])  return 1;
                    else    return 0;
                }
            }
        };
        Arrays.sort(intervals,com);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int[] temp:intervals){
            int st=temp[0];
            int end=temp[1];
            if(!pq.isEmpty() && st > pq.peek())   pq.poll();
            pq.offer(end);
        }
        return pq.size();
    }
}