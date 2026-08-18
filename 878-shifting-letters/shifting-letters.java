class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        long total = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {
            total = (total + shifts[i]) % 26;
            int ori = chars[i] - 'a';
            int n = (int) ((ori + total) % 26);
            chars[i] = (char) ('a' + n);
        }

        return new String(chars);
    }
}
