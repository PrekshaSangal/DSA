class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer,String> map=new TreeMap<>();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            int n = word.length();
            int index = word.charAt(n - 1) - '0';  
            String actualWord = word.substring(0, n - 1); 
            map.put(index, actualWord);
        }
        String answer="";
        for(Integer i:map.keySet()){
            answer=answer+map.get(i);
            answer=answer+" ";
        }  
        return answer.trim();    
    }
}