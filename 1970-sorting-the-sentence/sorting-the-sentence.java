class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        TreeMap<Integer,String> map= new TreeMap<>();
        for (int i=0;i<words.length;i++){
            String word=words[i];
            int pos=word.charAt(word.length()-1)-'0';
            String actual= word.substring(0,word.length()-1);
            map.put(pos,actual);
        }
        StringBuilder sb= new StringBuilder();
        for(int key:map.keySet()){
            sb.append(map.get(key)).append(" ");
        }
        return sb.toString().trim();
    }
}