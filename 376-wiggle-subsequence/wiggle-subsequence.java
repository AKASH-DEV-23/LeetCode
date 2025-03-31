class Solution {
    public int wiggleMaxLength(int[] nums) {
        List<Integer>brr=new ArrayList<>();
        for(int i=0;i<nums.length-1;++i){
            brr.add(nums[i+1]-nums[i]);
        }
        List<Integer>arr=new ArrayList<>();
        for(int num:brr) if(num!=0) arr.add(num);
        // arr=brr;
        //  System.out.print((arr));
        int maxi=Integer.MIN_VALUE;
        if(arr.size() >0 && arr.get(0)>=0){
           int j=0;
           int cnt=0;
           boolean pos=false;
           boolean neg=true;
           for(int num:arr){
                if(num>0 && neg) {
                    cnt++;// 1 // 3
                    neg=false;
                    pos=true;
                    // System.out.println("pos"+ num);
                }
            else{
                if(num<0 && pos) {
                    pos=false;cnt++; //2
                    neg=true;
                    // System.out.println("neg"+ num);

                }
           }
           }
           maxi=Math.max(maxi,cnt);
        }
           if(arr.size()>0 && arr.get(0)<0) {
            int j=0;
            boolean pos=true;
            boolean neg=false;
           int cnt=0;
           for(int num:arr){
                if(num<0 && pos) {
                    cnt++;
                    pos=false;
                    neg=true;
                }else{
                if(num>0 && neg) {
                    cnt++;
                    neg=false;
                    pos=true;
                }
           }
           maxi=Math.max(maxi,cnt);
        }
    }
        return maxi==Integer.MIN_VALUE?1:maxi+1;
    }
 }