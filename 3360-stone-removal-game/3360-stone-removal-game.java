class Solution {
    public boolean canAliceWin(int n) {
        int start = 10;
        int moves = 0;
        while (n >= start) {
            n -= start--;
            moves++;
        }
        return moves % 2 == 1;
    }
}