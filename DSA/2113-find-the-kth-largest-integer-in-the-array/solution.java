import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(String s:nums){
            BigInteger num=new BigInteger(s);
            pq.offer(num);
        }

        while(k>1 ){
            pq.poll();
            k--;
        }
        BigInteger newnum = pq.poll();
        if(newnum==null)    return "";
        return newnum.toString();
    }
}
