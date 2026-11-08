class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> num = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            
            if (check(i)) num.add(i);
        }
        return num;
    }
    public boolean check(int i){
        int or = i;
        while (i>0){
            if (i%10==0) return false;
            int num = (i%10);
            if (or%num!=0) return false;
            i/=10; 
        }
        return true;
    }
}