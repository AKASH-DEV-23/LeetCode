class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        Comparator<Integer> com=new Comparator<>(){
            public int compare(Integer a, Integer b){
                String s1=a+"";
                String s2=b+"";
                int i=0;
                int j=0;
                while(i<s1.length() && j<s2.length()){
                    if(s1.charAt(i)<s2.charAt(j)){
                        return -1;
                    }else if(s1.charAt(i)>s2.charAt(j)){
                        return 1;
                    }
                    i++;
                    j++;
                }
                return s1.length()<s2.length()?-1:1;
            }
        };
        Collections.sort(list,com);
        return list;
    }
}
