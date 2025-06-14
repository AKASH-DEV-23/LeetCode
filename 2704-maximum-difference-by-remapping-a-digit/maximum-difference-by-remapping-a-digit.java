class Solution {
    public int minMaxDifference(int num) {
        String s=num+"";
        char firstNon9=0;
        char firstNon0=0;
        for(char ch:s.toCharArray()){
            if(firstNon9 ==0 && ch>='0' && ch<'9')   firstNon9=ch;
            if(firstNon0 ==0 && ch>='1' && ch<='9')    firstNon0=ch;
        }
        String max=firstNon9!=0 ? s.replace(firstNon9,'9') :s;
        String min=firstNon0 !=0 ? s.replace(firstNon0,'0') :s;
        return Integer.parseInt(max)-Integer.parseInt(min);
    }
}