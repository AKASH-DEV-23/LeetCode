class Solution {
    public int maxEvents(int[][] events) {
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[1]<b[1])   return -1;
                else if(a[1]>b[1])  return 1;
                else{
                    if(a[0]<b[0])   return -1;
                    else if(a[0]>b[0])  return 1;
                    else    return 0;
                }
            }
        };
        Set<Integer> visited=new HashSet<>();
        Arrays.sort(events,com);
        int maxi=0;
        int idx=1;
        for(int i=0;i<events.length;i++){
            int st=events[i][0];
            int end=events[i][1];
            boolean flag=st>idx ? false:true;
            for(int j=st>idx?st:idx;j<=end;j++){
                if(!visited.contains(j)){
                    maxi++;
                    visited.add(j);
                    if(flag)
                        idx=j+1;
                    break;
                }
            }
        }
        return maxi;
    }
}