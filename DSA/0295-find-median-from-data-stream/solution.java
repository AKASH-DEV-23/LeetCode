class MedianFinder {
    PriorityQueue<Integer> minpq = new PriorityQueue<>();
    PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (minpq.size() == maxpq.size()) {
            maxpq.offer(num);
            minpq.offer(maxpq.poll());
        } else {
            minpq.offer(num);
            maxpq.offer(minpq.poll());
        }
    }

    public double findMedian() {
        if (minpq.size() == maxpq.size()) {
            return (minpq.peek() + maxpq.peek()) / 2.0;
        } else {
            return minpq.peek();
        }
    }
}

