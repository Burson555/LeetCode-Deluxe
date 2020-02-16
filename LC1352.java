class ProductOfNumbers {

    int[] arr;
    int size;
    int tail;
    
    public ProductOfNumbers() {
        this.size = 1;
        this.tail = 0;
        this.arr = new int[this.size];
    }
    
    public void add(int num) {
        if (this.tail == this.size) {
            this.size = 2 * this.size;
            int new_arr[] = new int[this.size];
            for (int i = 0; i < this.arr.length; i++)
                new_arr[i] = this.arr[i];
            this.arr = new_arr;
        }
        this.arr[this.tail] = num;
        this.tail++;
    }
    
    public int getProduct(int k) {
        int res = 1, index = this.tail-1;
        for (int i = 0; i < k; i++)
            res *= this.arr[index-i];
        return res;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */