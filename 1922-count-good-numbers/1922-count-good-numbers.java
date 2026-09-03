class Solution {
    static int MOD = 1000000007;

    public long power(long a, long b) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long even = (n+1) / 2, odd = (n / 2);
        return (int) (power(5, even) * power(4, odd) % MOD);
    }
}