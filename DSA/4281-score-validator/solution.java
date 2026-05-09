class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;
        for(String temp:events){
            if(temp.equals("W")){
                counter++;
                if(counter==10){
                    break;
                }
            }else if(temp.contains("D") || temp.contains("B")){
                score++;
            }else{
                score+=Integer.parseInt(temp);
            }
        }
        return new int[]{score,counter};
    }
}
