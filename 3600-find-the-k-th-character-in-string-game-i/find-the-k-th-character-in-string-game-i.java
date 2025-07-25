class Solution {
    public char kthCharacter(int k) {
        String s="a";
        
        while(s.length()<k){
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            char next=(char)(ch+1);
            sb.append(next);
        }
        s=s+sb.toString();
        }
        return s.charAt(k-1);
    }
}