class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len2=nums2.length;
        int[] ans2=new int[len2];
        len2-=1;
        Stack<Integer> st=new Stack<>();
        while(len2>=0){
            while(!st.isEmpty() && st.peek()<nums2[len2])   st.pop();
            if(st.isEmpty())    ans2[len2]=-1;
            else    ans2[len2]=st.peek();
            st.push(nums2[len2]);
            len2--;
        }
        Map<Integer,Integer> map=new HashMap<>();
        len2=nums2.length;
        for(int i=0;i<len2;i++){
            map.put(nums2[i],ans2[i]);
        }
        int i=0;
        for(int num:nums1){
            nums1[i++]=map.get(num);
        }
        return nums1;
    }
}
