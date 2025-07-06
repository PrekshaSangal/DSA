class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = -1;
        for (int i=0;i<words.length;i++) {
            if (Character.isDigit(words[i].charAt(0))) {
                int num = Integer.parseInt(words[i]);
                if (num <= prev) {
                    return false;
                }
                prev = num;
            }
        }

        return true;
    }
}
