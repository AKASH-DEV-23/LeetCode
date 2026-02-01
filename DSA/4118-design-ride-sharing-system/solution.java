class RideSharingSystem {
    List<Integer> driver;
    List<Integer> rider;

    public RideSharingSystem() {
        driver=new ArrayList<>();
        rider=new ArrayList<>();
    }
    
    public void addRider(int riderId) {
        rider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(rider.size() >0 && driver.size() >0){
            int ans[]= new int[]{driver.get(0),rider.get(0)};
            rider.remove(0);
            driver.remove(0);
            return ans;
        }
        return new int[]{-1,-1};
    }
    
    public void cancelRider(int riderId) {
        for(int i=0;i<rider.size();i++){
            if(rider.get(i)==riderId){
                rider.remove(i);
                break;
            }
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
