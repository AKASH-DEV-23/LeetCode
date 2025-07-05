class Solution {
    public String concatHex36(int n) {
        int n2=n*n;
        int n3=(int)Math.pow(n,3);
        StringBuilder hexa=new StringBuilder();
        StringBuilder tri=new StringBuilder();
        
        while(n2>0){
            int rem=n2%16;
            hexa.append(findHexa(rem));
            n2=n2/16;
        }
        hexa.reverse();
        System.out.print(hexa);
        while(n3>0){
            int rem=n3%36;
            tri.append(findTri(rem));
            n3=n3/36;
        }
        tri.reverse();
        hexa.append(tri);
        return hexa.toString();
    }
    private String findHexa(int n){
        if(n<=9)  return n+"";
        else if(n==10)  return "A";
        else if(n==11)  return "B";
        else if(n==12)  return "C";
        else if(n==13)  return "D";
        else if(n==14)  return "E";
        else if(n==15)  return "F";
        return "";
    }
    private String findTri(int num){
        if(num<=9)  return num+"";
        String st="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Map<Integer,Character> map=new HashMap<>();
        int id=10;
        for(char ch:st.toCharArray()){
            map.put(id,ch);
            id++;
        }
        return ""+map.get(num);
    }
}
