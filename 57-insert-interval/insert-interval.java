class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> myList=new ArrayList<>();
        boolean flag=true;
        for(int[] edge:intervals){
            myList.add(edge);
        }
        myList.add(new int[]{newInterval[0],newInterval[1]});
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[0]<b[0])   return -1;
                else if(a[0]>b[0])  return 1;
                else return 0;
            }
        };
        Collections.sort(myList,com);
        // myList.forEach(arr -> System.out.print(Arrays.toString(arr)));
        int[] temp=new int[]{myList.get(0)[0],0};
        List<int[]> ans=new ArrayList<>();
        int lastTime=myList.get(0)[1];
        for(int i=1;i<myList.size();i++){
            int st=myList.get(i)[0];
            int end=myList.get(i)[1];
            if(st>lastTime){
                temp[1]=lastTime;
                ans.add(temp);
                temp=new int[]{st,0};
                lastTime=end;
            }else{
                lastTime=Math.max(lastTime,end);
            }
        }
        temp[1]=lastTime;
        ans.add(temp);
        ans.forEach(arr -> System.out.print(Arrays.toString(arr)));
        int[][] finalAns=ans.toArray(new int[0][0]);
        return finalAns;
    }
}