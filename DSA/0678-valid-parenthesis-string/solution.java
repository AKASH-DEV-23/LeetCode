class Solution {
    public boolean checkValidString(String s) {
        return findString(s,0,0);
    }
    Map<String,Boolean> memo=new HashMap<>();
    private boolean findString(String s, int idx, int open){
        String str=idx+","+open;
        if(memo.containsKey(str))    return memo.get(str);
        boolean result;
        if(idx==s.length())   return open==0;
        if(open<0)  return false;
        if(s.charAt(idx)=='(') result = findString(s,idx+1,open+1);
        else if(s.charAt(idx)==')') result =  findString(s,idx+1,open-1);
        else{
            result = findString(s,idx+1,open+1) ||
                    findString(s,idx+1,open-1) ||
                    findString(s,idx+1,open);
        }
        memo.put(str,result);
        return result;
    }
}
