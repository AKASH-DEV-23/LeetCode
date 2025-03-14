class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str= new StringBuilder();
        int n1=num1.length();
        int n2=num2.length();
        int i=n1-1;
        int j=n2-1;
        int carry=0;
        while(i>=0 && j>=0){
            int val1=num1.charAt(i)-'0';
            int val2=num2.charAt(j)-'0';
            int sum=val1+val2+carry;
            carry=sum/10;
            str.append(sum%10);
            i--;
            j--;
        }
        while(i>=0){
            int val=num1.charAt(i)-'0';
            int sum=val+carry;
            carry=sum/10;
            str.append(sum%10);
            i--;
        }
        while(j>=0){
            int val=num2.charAt(j)-'0';
            int sum=val+carry;
            carry=sum/10;
            str.append(sum%10);
            j--;
        }
        if(carry!=0)    str.append(carry);
        // System.out.println(str.toString());
        return str.reverse().toString();
    }
}