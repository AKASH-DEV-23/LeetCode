class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n=tops.length;
        int mini=1000000;
        int first=tops[0];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(tops[i]==first){
                continue;
            }else if(bottoms[i]==first){
                cnt++;
            }else{
                cnt=1000000;
                break;
            }
        }
        mini=Math.min(mini,cnt);
        cnt=0;
        int second=bottoms[0];
        for(int i=0;i<n;i++){
            if(bottoms[i]==second){
                continue;
            }else if(tops[i]==second){
                cnt++;
            }else{
                cnt=1000000;
                break;
            }
        }
        mini=Math.min(mini,cnt);
        cnt=0;
        for(int i=0;i<n;i++){
            if(tops[i]==second){
                continue;
            }else if(bottoms[i]==second){
                cnt++;
            }else{
                cnt=1000000;
                break;
            }
        }
        mini=Math.min(mini,cnt);
        cnt=0;
        for(int i=0;i<n;i++){
            if(bottoms[i]==first){
                continue;
            }else if(tops[i]==first){
                cnt++;
            }else{
                cnt=1000000;
                break;
            }
        }
        mini=Math.min(mini,cnt);
        return mini==1000000?-1:mini;
    }
}