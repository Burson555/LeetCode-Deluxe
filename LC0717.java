// Runtime: 0 ms, faster than 100.00% of Java online submissions for 1-bit and 2-bit Characters.
// Memory Usage: 38.6 MB, less than 11.11% of Java online submissions for 1-bit and 2-bit Characters.

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length <= 2) return bits[0] == 0;
        if (bits[bits.length-2] == 0) return true;
        int count_1 = 0;
        for (int i = bits.length-2; i >= 0; i--) {
            if (bits[i] == 1) count_1++;
            else break;
        }
        return count_1%2 == 0;
    }
}

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length <= 2) return bits[0] == 0;
        int count_1 = 0;
        for (int i = bits.length-3; i >= 0; i--) {
            if (bits[i] == 1) count_1++;
            else break;
        }
        return (count_1%2 == 0 && bits[bits.length-2] == 0) || (count_1%2 == 1);
    }
}