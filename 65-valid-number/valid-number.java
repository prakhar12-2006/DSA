class Solution {
    public boolean isNumber(String s) {
        boolean num = false;
        boolean dot = false;
        boolean e = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = true;

            } else if (c == '.') {
                if (dot || e) {
                    return false;
                }
                dot = true;

            } else if (c == 'e' || c == 'E') {
                if (!num || e) {
                    return false;
                }
                e = true;
                num = false;

            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }

            } else {
                return false;
            }
        }

        return num;
    }
}
