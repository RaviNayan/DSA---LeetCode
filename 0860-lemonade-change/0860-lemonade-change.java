class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change = 0;
        int d5 = 0, d10 = 0, d20 = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                d5++;
            else if (bills[i] == 10) {
                d10++;
                d5--;
            } else {
                d20++;
                if (d10 > 0) {
                    d10--;
                    d5--;
                } else {
                    d5 -= 3;
                }
            }

            if (d5 < 0 || d10 < 0 || d20 < 0)
                return false;
        }
        return true;
    }
}