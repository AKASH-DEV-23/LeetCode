import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) { // Hours from 0 to 11
            for (int m = 0; m < 60; m++) { // Minutes from 0 to 59
                // Count the number of 1s in the binary representation of hours and minutes
                int count = Integer.bitCount(h) + Integer.bitCount(m);
                if (count == turnedOn) {
                    // Format the time as "H:MM"
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return result;
    }
}

