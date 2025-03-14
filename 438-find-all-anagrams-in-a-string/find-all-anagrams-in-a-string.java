class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] arr=new int[26];
        for(char ch:p.toCharArray())    arr[ch-'a']++;
        // System.out.println(Arrays.toString(arr));
        int j=0;
        int n=p.length();
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']--;
            if(i-j+1==n){
                if(checkZeros(arr)) list.add(j);
                arr[s.charAt(j)-'a']++;
                j++;
            }
        }
        return list;
    }
    private boolean checkZeros(int[] arr){
        for(int num:arr){
            if(num!=0)  return false;
        }
        return true;
    }
}