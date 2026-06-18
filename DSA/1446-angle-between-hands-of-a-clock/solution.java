class Solution {
    public double angleClock(int hour, int minutes) {
        double firstAngle= Math.abs((30*hour)-(5.5*minutes));
        return Math.min(firstAngle,360-firstAngle);
    }
}
