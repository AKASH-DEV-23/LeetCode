class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Comparator<int[]> com=new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0]<b[0])   return -1;
                else if(a[0]>b[0])  return 1;
                else{
                    if(a[1]<b[1])   return -1;
                    else if(a[1]>b[1])  return 1;
                    else    return 0;
                }
            }
        };
        // Arrays.sort(dominoes,com);
        for(int[] a:dominoes){
            Arrays.sort(a);
        }
        int cnt=0;
        for(int i=0;i<dominoes.length;i++){
            for(int j=i+1;j<dominoes.length;j++){
                if(dominoes[i][0]==dominoes[j][0] && dominoes[i][1]==dominoes[j][1]){
                    cnt++;
                }
            }
        }
        System.out.println(Arrays.deepToString(dominoes));
        return cnt;
    }
}