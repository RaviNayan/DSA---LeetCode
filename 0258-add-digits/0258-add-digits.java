class Solution {
    public int sumTotal(int sum){
        if (sum<10) return sum;
        int temp = 0;
        while(sum>0){
            temp+=sum%10;
            sum/=10;
        }
        return sumTotal(temp);
    }

    public int addDigits(int num) {
        if (num<10) return num;
        int sum = 0, sumTotal = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sumTotal(sum);
    }
}