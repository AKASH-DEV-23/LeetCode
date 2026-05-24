class Solution {
    public int passwordStrength(String password) {
        int point=0;
        int[] ascii=new int[128];
        for(char ch:password.toCharArray()){
            if(ascii[ch]!=0)  continue;
            if(ch>='a' && ch<='z'){
                point++;
            }
            else if(ch>='A' && ch<='Z'){ 
                point+=2;
            }
            else if(ch>='0' && ch<='9'){
                point+=3;
            }
            else{
                point+=5;
            }
            ascii[ch]=1;
        }
        return point;
    }
}
