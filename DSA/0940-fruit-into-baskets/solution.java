class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        int size=fruits.length;
        int i=0;
        for(int j=0;j<size;j++){
            mp.put(fruits[j],mp.getOrDefault(fruits[j],0)+1);
            while(mp.size()>2){
                int val=mp.get(fruits[i]);
                val--;
                if(val==0)  mp.remove(fruits[i]);
                else    mp.put(fruits[i],val);
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}
