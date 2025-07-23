class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean vowel=false;
        boolean cons=false;

        char[] c= word.toCharArray();
        for(char ch: c){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
            char lower=Character.toLowerCase(ch);
            if(lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u'){
                vowel = true;
            }else{
                cons = true;
            }
            }
        }
        return vowel&&cons;
    }
}