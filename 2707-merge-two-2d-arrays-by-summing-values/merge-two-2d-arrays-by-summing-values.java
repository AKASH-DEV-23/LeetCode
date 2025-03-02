class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        List<List<Integer>> ans = new ArrayList<>();
        while(i<n1 && j<n2){
            int id1=nums1[i][0];
            int id2=nums2[j][0];
            int val1=nums1[i][1];
            int val2=nums2[j][1];
            List<Integer> list=new ArrayList<>();
            if(id1==id2){
                list.add(id1);
                list.add(val1+val2);
                i++;
                j++;
            }else if(id1<id2){
                list.add(id1);
                list.add(val1);
                i++;
            }else{
                list.add(id2);
                list.add(val2);
                j++;
            }
            ans.add(list);
        }

        while(i<n1){
            List<Integer> list = new ArrayList<>();
            list.add(nums1[i][0]);
            list.add(nums1[i][1]);
            i++;
            ans.add(list);
        }
        while(j<n2){
            List<Integer> list = new ArrayList<>();
            list.add(nums2[j][0]);
            list.add(nums2[j][1]);
            j++;
            ans.add(list);
        }

        int[][] res=new int[ans.size()][2];

        for( i=0;i<ans.size();i++){
            int k=0;
            for(int num:ans.get(i)){
                if(k==0)
                    res[i][0]=num;
                else
                    res[i][1]=num;
                k=1;
            }
        }
        return res;
    }
}