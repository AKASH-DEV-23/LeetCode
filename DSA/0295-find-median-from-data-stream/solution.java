class MedianFinder {
    PriorityQueue<Integer> minpq=new PriorityQueue();
    PriorityQueue<Integer> maxpq=new PriorityQueue(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(minpq.size()==maxpq.size()){
            minpq.offer(num);
            maxpq.offer(minpq.poll());
        }else{
            maxpq.offer(num);
            minpq.offer(maxpq.poll());
        }
    }
    
    public double findMedian() {
        if(minpq.size()==maxpq.size())    return (minpq.peek()+maxpq.peek())/2.0;
        else    return maxpq.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
