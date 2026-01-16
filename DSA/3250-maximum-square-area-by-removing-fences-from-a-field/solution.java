class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Arrays.sort(hFences);
        Arrays.sort(vFences);
        List<Integer> hFens=new ArrayList<>();
        List<Integer> vFens=new ArrayList<>();
        hFens.add(1);
        for(int temp:hFences)   hFens.add(temp);
        hFens.add(m);
        vFens.add(1);
        for(int temp:vFences)   vFens.add(temp);
        vFens.add(n);
        Set<Integer> vis=new HashSet<>();
        for(int i=0;i<hFens.size();i++){
            for(int j=i+1;j<hFens.size();j++){
                vis.add(hFens.get(j)-hFens.get(i));
            }
        }
        long max=-1;
        for(int i=0;i<vFens.size();i++){
            for(int j=i+1;j<vFens.size();j++){
                int diff=vFens.get(j)-vFens.get(i);
                if(vis.contains(diff)){
                    max=Math.max(diff,max);
                }
            }
        }
       if(max==-1)  return -1;
        System.out.print("max1 "+max);
        max=max*max;
        System.out.print("max "+max);
        return (int)(max%1000000007);
    }
}
