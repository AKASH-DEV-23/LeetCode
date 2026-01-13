class Solution {
    public double separateSquares(int[][] squares) {
        final double halfArea =
        Arrays.stream(squares).mapToDouble(sq -> (double)sq[2]*sq[2]).sum() / 2.0;
        List<int[]> events = new ArrayList<>();
        for(int[] sq : squares) {
            int y = sq[1], l = sq[2];
            events.add(new int[]{y, l});
            events.add(new int[]{y + l, -l});
        }
        events.sort(Comparator.comparingInt(a -> a[0]));
        double accArea = 0.0;
        long curSlope = 0;
        int prevY = events.get(0)[0];
        for (int[] ev : events) {
            int y = ev[0], deltaL = ev[1];
            double dy = (double)(y - prevY);
            if (curSlope > 0) {
                double gain = curSlope * dy;
                if (accArea + gain >= halfArea) {
                    return prevY + (halfArea - accArea) / curSlope;
                }
                accArea += gain;
            }
            curSlope += deltaL;
            prevY = y;
        }
        return prevY; 
    }
}

