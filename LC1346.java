class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (hs.contains(2*curr) || (curr % 2 == 0 && (hs.contains(curr/2))))
                return true;
            hs.add(curr);
        }
        return false;
    }
}