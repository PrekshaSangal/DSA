class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for( char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int maxVowel=0;
        int maxconst=0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char ch= entry.getKey();
            int count= entry.getValue();

            if(vowels.contains(ch)){
                maxVowel = Math.max(maxVowel, count);
            } else{
                maxconst = Math.max(maxconst, count);
            }
        }
        return maxVowel + maxconst;
    }
}