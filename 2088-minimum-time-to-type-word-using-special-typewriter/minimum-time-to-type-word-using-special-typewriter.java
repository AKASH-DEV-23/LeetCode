class Solution {
    public int minTimeToType(String word) {
        Map<Character,Integer> map=new HashMap<>();
        char che='a';
        map.put('a',1);
        for(int i=2;i<=26;i++){
            che++;
            map.put(che,i);
        }
        char curr='a';
        int sum=0;
        for(char ch:word.toCharArray()){
            int val=Math.abs(map.get(curr)-map.get(ch));
            int mini=Math.min(val,26-val);
            sum+=mini;
            curr=ch;
        }
        // System.out.println(map);
        return sum+word.length();
    }
}