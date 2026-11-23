class ProductOfNumbers {

    ArrayList<Integer> list = new ArrayList<>();
    int prod = 1, count = 0;

    public ProductOfNumbers() {

    }

    public void add(int num) {
        if (num == 0) {
            prod = 1;
            this.list.add(num);
            count = 0;
        } else {
            prod *= num;
            this.list.add(prod);
            count++;
        }
    }

    public int getProduct(int k) {
        int len = this.list.size();
        if (k > count)
            return 0;
        else if (k == count)
            return this.list.get(len - 1);
        else {
            int r = this.list.get(len - 1) / this.list.get(len - k - 1);
            return r;
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */