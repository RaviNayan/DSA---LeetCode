class Solution {
    public int reverse(int x) {
        
       int q, r, pnum, newNum=0;

        if (x<0) {pnum = -x;}
        else {pnum = x;}
        
        while (pnum!=0){
            r=pnum%10;
            q=pnum/10;

            if (newNum > Integer.MAX_VALUE / 10 || (newNum == Integer.MAX_VALUE / 10 && r > 7)) return 0;
            if (newNum < Integer.MIN_VALUE / 10 || (newNum == Integer.MIN_VALUE / 10 && r < -8)) return 0;
            newNum=(newNum*10)+r;
            pnum=q;
        }

        if (x<0) return (-newNum);
        else {return newNum;}

    }
}