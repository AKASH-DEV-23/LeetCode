class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int oneType=0;
        int zeroType=0;
        for(int num:students){
            if(num==1)  oneType++;
            else    zeroType++;
        }
        for(int num:sandwiches){
            if(num==1 && oneType>0) oneType--;
            else if(num==0 && zeroType>0)   zeroType--;
            else    break;
        }
        return oneType+zeroType;
    }
}