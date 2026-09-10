class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if (divisor == 1)
            return dividend;
        boolean isPos = true;
        if (dividend < 0 && divisor > 0)
            isPos = false;
        else if (dividend > 0 && divisor < 0)
            isPos = false;
        long n = dividend, d = divisor;
        n = Math.abs(n);
        d = Math.abs(d);

        long sum = 0, ans = 0;

        while (n>=d) {
            long temp = d;
            long num = 1;
            while(n >= (temp<<1)){
                temp<<=1;
                num<<=1;
            }
            ans+=num;
            n-=temp;
        }

        if (ans > Integer.MAX_VALUE && isPos)
            return Integer.MAX_VALUE;
        if (ans > Integer.MAX_VALUE && !isPos)
            return Integer.MIN_VALUE;

        return isPos ? (int) ans : (int) (-ans);
    }
}