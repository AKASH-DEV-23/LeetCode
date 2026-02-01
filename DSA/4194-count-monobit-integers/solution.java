class Solution {
    public int countMonobit(int n) {
        if(n==0)  return 1;
        if(n==1)  return 2;
        if(n==3)  return 3;
        if(n==7)  return 4;
        if(n==15)  return 5;
        if(n==31)  return 6;
        if(n==63)  return 7;
        if(n==127)  return 8;
        if(n==255)  return 9;
        if(n==511)  return 10;
        if(n==1023)  return 11;

        if(n<3)  return 2;
        if(n<7)  return 3;
        if(n<15)  return 4;
        if(n<31)  return 5;
        if(n<63)  return 6;
        if(n<127)  return 7;
        if(n<255)  return 8;
        if(n<511)  return 9;
        if(n<1023)  return 10;  
        return 0;
    }
}
