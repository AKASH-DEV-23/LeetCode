
class Solution {
    public int possibleStringCount(String word) {
        List<Integer> groupLengthsing = new ArrayList<>();
        int n = word.length();
        int i = 0;
        while (i<n) {
            int startingPointing=i;
            while (i < n && word.charAt(i) == word.charAt(startingPointing)) {
                i++;
            }
            groupLengthsing.add(i - startingPointing);
        }
        int totalPossibilitiesing = 1;
        for (int length : groupLengthsing) {
            totalPossibilitiesing += length-1;
        }
        
        return totalPossibilitiesing;
    }
}

