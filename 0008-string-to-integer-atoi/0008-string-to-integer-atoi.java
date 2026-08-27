class Solution {
    public int myAtoi(String s) {
        String sup = s.trim();
        if (sup.length() == 0)
            return 0;
        int sign = 1;
        int i = 0;
        if (sup.charAt(i) == '-' || sup.charAt(i) == '+') {
            sign = (sup.charAt(i++) == '-') ? -1 : 1;
        }
        long num = 0;
        while (i < sup.length() && Character.isDigit(sup.charAt(i))) {
            num = num * 10 + (sup.charAt(i++) - '0');
            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }

        return (int) (sign * num);
    }
}