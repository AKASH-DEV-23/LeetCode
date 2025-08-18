class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long chem=0;
        int i=0;
        int j=skill.length-1;
        int sum=skill[i]+skill[j];
        while(i<j){
            if(skill[i]+skill[j]!=sum)  return -1;
            chem+=skill[i++]*skill[j--];
        }
        return chem;
    }
}
