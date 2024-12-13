class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int carry=0;
        int p=num.length-1;
        while(p>=0 || k>0){
            int numVal=0;
            if(p>=0){
                numVal=num[p];
                p--;
            }
            int lastDigit=k%10;
            k/=10;
            int sum=numVal+lastDigit+carry;
            carry=sum/10;
            sum%=10;
            list.add(sum);
        }
        if(carry>0){
            list.add(carry);
        }
        Collections.reverse(list);
        return list;
    }
}
