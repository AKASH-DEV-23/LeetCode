
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] < b[0]) {
                    return -1;
                } else if (a[0] > b[0]) {
                    return 1;
                } else {
                    if (a[1] < b[1]) {
                        return -1;
                    } else if (a[1] > b[1]) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        PriorityQueue<Integer> free = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a < b) {
                    return -1;
                } else if (a > b) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        PriorityQueue<long[]> busy = new PriorityQueue<>(new Comparator<long[]>() {
            @Override
            public int compare(long[] a, long[] b) {
                long endTimeA = a[0];
                long endTimeB = b[0];
                long roomA = a[1];
                long roomB = b[1];

                if (endTimeA < endTimeB) {
                    return -1;
                } else if (endTimeA > endTimeB) {
                    return 1;
                } else {
                    if (roomA < roomB) {
                        return -1;
                    } else if (roomA > roomB) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        int[] cnt = new int[n];

        for (int i = 0; i < n; i++) {
            free.offer(i);
        }

        for (int[] m : meetings) {
            long s = m[0];
            long d = m[1] - m[0];

            while (!busy.isEmpty()) {
                long[] peekRoom = busy.peek();
                if (peekRoom[0] <= s) {
                    long[] finishedRoom = busy.poll();
                    int roomNum = (int) finishedRoom[1];
                    free.offer(roomNum);
                } else {
                    break;
                }
            }

            if (!free.isEmpty()) {
                int r = free.poll();
                busy.offer(new long[] { m[1], r });
                cnt[r]++;
            } else {
                long[] x = busy.poll();
                long newEndTime = x[0] + d;
                int roomNum = (int) x[1];
                busy.offer(new long[] { newEndTime, roomNum });
                cnt[roomNum]++;
            }
        }

        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (cnt[i] > cnt[ans]) {
                ans = i;
            }
        }
        return ans;
    }
}
