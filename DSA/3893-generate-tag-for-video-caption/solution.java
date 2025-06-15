class Solution {
    public String generateTag(String caption) {
        String cap=caption.replaceFirst("^caption\\s*","");
        String[] arr=cap.trim().split("\\s+");
        if(arr.length==0)  return "#";
        // System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder();
        sb.append("#");
        sb.append(arr[0].toLowerCase());
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                char ch=arr[i].charAt(j);
                String s=ch+"";
                if(j==0){
                    sb.append(s.toUpperCase());
                }else{
                    sb.append(s.toLowerCase());
                }
            }
        }
        StringBuilder sbr=new StringBuilder();
        if(sb.length()<=100)  return sb.toString();
        else{
            for(int i=0;i<100;i++){
                sbr.append(sb.charAt(i));
            }
        }
        return sbr.toString();
    }
}
