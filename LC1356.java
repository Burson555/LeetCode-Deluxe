class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < a.length; ++i)
            a[i] = arr[i];
        Arrays.sort(a, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < a.length; ++i)
            arr[i] = a[i];
        return arr;
    } 
}

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] wrapper = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(wrapper, (a, b) -> {
            int c1 = Integer.bitCount(a);
            int c2 = Integer.bitCount(b);
            if (c1 < c2) return -1;
            else if (c2 < c1) return 1;
            return Integer.compare(a, b);
        });
        for (int i=0;i<arr.length;i++) {
            arr[i]=wrapper[i];
        }
        return arr;
    }
}