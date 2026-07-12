class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start=solve(startTime);
        int end=solve(endTime);
        return end-start;
    }

    private int solve(String time){
        String[] part=time.split(":");
        int hour=Integer.parseInt(part[0]);
        int minute=Integer.parseInt(part[1]);
        int second=Integer.parseInt(part[2]);
        int totalSecond= hour*3600+minute*60+second;
        return totalSecond;
    }
}
