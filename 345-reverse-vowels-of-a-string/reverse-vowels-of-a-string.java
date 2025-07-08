class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        Set<Character> vowels =new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );
            int left=0;
            int right=ch.length-1;
            while(left<right){
            if(!vowels.contains(ch[left])){
                left++;
            }else if (!vowels.contains(ch[right])){
                right--;
            }else{
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            }
             return new String(ch);
    }
}
