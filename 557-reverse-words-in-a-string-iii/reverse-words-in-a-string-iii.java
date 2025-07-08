class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(String word:words){
            StringBuilder revword= new StringBuilder(word).reverse();
            sb.append(revword).append(" ");
        }
        return sb.toString().trim();
    }
}