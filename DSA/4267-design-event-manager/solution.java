class EventManager {

    PriorityQueue<int[]> pq;
    Map<Integer,Integer> mp;
    
    public EventManager(int[][] events) {
        pq=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])    return b[1]-a[1];
            return a[0]-b[0];
        });
        mp=new HashMap<>();
        for(int[] temp:events){
            int id=temp[0];
            int priority=temp[1];
            mp.put(id,priority);
            pq.offer(new int[]{id,priority});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        mp.put(eventId,newPriority);
        pq.offer(new int[]{eventId,newPriority});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            int id=temp[0];
            int priority=temp[1];
            if(!mp.containsKey(id))  continue;
            if(mp.get(id)==priority){
                mp.remove(id);
                return id;
            }
        }
        return -1;
    }
}


/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */
