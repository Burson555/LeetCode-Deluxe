// Runtime: 16 ms, faster than 50.00% of Java online submissions for Reformat The String.
// Memory Usage: 47.2 MB, less than 100.00% of Java online submissions for Reformat The String.

class Solution {
    public String reformat(String s) {
        Queue<Character> q_letter  = new LinkedList<>();
        Queue<Character> q_number  = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c <= '9') q_number.add(c);
            else q_letter.add(c);
        }
        int size_letter = q_letter.size();
        int size_number = q_number.size();
        if (Math.abs(size_letter - size_number) > 1) return "";
        StringBuilder sb = new StringBuilder();
        if (size_letter > size_number) {
            sb.append(q_letter.remove());
            while (!q_letter.isEmpty() && !q_number.isEmpty()) {
                sb.append(q_number.remove());
                sb.append(q_letter.remove());
            }
            return sb.toString();
        } else if (size_number > size_letter) {
            sb.append(q_number.remove());
            while (!q_letter.isEmpty() && !q_number.isEmpty()) {
                sb.append(q_letter.remove());
                sb.append(q_number.remove());
            }
            return sb.toString();
        } else {
            while (!q_letter.isEmpty() && !q_number.isEmpty()) {
                sb.append(q_letter.remove());
                sb.append(q_number.remove());
            }
            return sb.toString();
        }
    }
}