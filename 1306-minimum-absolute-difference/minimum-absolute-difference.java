class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int currDiff=arr[i]-arr[i-1];
            diff=Math.min(diff,currDiff);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==diff){
                List<Integer> curr=new ArrayList<>();
                curr.add(arr[i-1]);
                curr.add(arr[i]);
                list.add(curr);
            }
        }
        return list;
    }
}