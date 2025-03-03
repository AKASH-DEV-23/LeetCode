class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int cnt=0;
        int i=0;
        int A=capacityA;
        int B=capacityB;
        int j=plants.length-1;
        while(i<j){
            if(plants[i]>capacityA){
                cnt++;
                capacityA=A;
                capacityA-=plants[i];
            }else{
                capacityA-=plants[i];
            }
            if(plants[j]>capacityB){
                cnt++;
                capacityB=B;
                capacityB-=plants[j];
            }else{
                capacityB-=plants[j];
            }
            i++;
            j--;
        }
        if(i==j && plants[i]>Math.max(capacityA,capacityB)){
            cnt++;
        }
        return cnt;
    }
}
