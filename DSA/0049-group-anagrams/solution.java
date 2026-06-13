class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap=new HashMap<>();

        for(String word:strs){
            
            int[] frequencyOfWord=new int[26];
            for(char currentChar:word.toCharArray()){
                frequencyOfWord[currentChar-'a']++;
            }

            StringBuilder sb=new StringBuilder();
            for(int count:frequencyOfWord){
                sb.append(count);
                sb.append("#");
            }
            String key=sb.toString();

            anagramMap.computeIfAbsent(key,k->new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
