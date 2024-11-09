// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int one = 0;
//         int maxOne=0;
//         for (int num : nums) {
//             if(num==1){
//                 one++;
//             } else{
//                 if(one>maxOne){
//                     maxOne=one;
//                 }
//                 one=0;
//             }
//         }
//         return maxOne>one ? maxOne:one ;
//     }
// }

class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max > count ? max : count;
    }
}
