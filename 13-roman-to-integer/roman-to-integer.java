class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int curval = getValue(ch);

            if (i + 1 < s.length() && getValue(s.charAt(i + 1)) > curval) {
                total -= curval;
            } else {
                total += curval;
            }
        }
        return total;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
