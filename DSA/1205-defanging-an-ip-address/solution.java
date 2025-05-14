class Solution {
    public String defangIPaddr(String address) {
        String[] arr=address.split("\\.");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length-1;i++){
            sb.append(arr[i]);
            sb.append("[.]");
        }
        sb.append(arr[arr.length-1]);
        return sb.toString();
    }
}
