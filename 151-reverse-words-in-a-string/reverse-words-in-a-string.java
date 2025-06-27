class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String emp="";
        for(int i=str.length-1;i>0;i--){
            emp= emp + str[i]+ " ";
        }
        return emp+str[0];
    }
}