class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> visitedA=new HashSet<>();
        Set<Integer> visitedB=new HashSet<>();
        int[] ans=new int[A.length];

        for(int i=0;i<A.length;i++){
            visitedA.add(A[i]);
            visitedB.add(B[i]);
            if(A[i]==B[i]){
                ans[i]+=1;
            }else{
                if(visitedB.contains(A[i])) ans[i]+=1;
                if(visitedA.contains(B[i])) ans[i]+=1;
            }
            if(i!=0)
                ans[i]+=ans[i-1];
        }
        return ans;
    }
}
