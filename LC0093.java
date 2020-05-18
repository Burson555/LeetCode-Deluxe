// Runtime: 3 ms, faster than 70.16% of Java online submissions for Restore IP Addresses.
// Memory Usage: 39.7 MB, less than 6.98% of Java online submissions for Restore IP Addresses.

class Solution {

	List<String> res_l;
    
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        res_l = new LinkedList<>();
        if (n < 4 || n > 12) return res_l;

        dfs(s, n, 0, new StringBuilder());
        return res_l;
    }

    private void dfs(String s, int n, int stage, StringBuilder sb) {
    	// quit condition: hit
    	if (stage == 4 && s.length() == 0) {
    		res_l.add(sb.toString());
    		return;
    	}

    	// node selection
    	for (int i = 1; i <= 3; i++) {
    		if (i > s.length()) return;
    		String temp = s.substring(0, i);
    		int value = Integer.parseInt(temp);
    		if (value > 255 || 
    			(value != 0 && temp.startsWith("0")) ||
    			(value == 0 && temp.length() > 1)) return;

    		sb.append(temp);
    		if (stage != 3) sb.append('.');
    		dfs(s.substring(i), n, stage+1, sb);
    		sb.delete(sb.length()-i, sb.length());
    		if (stage != 3) sb.deleteCharAt(sb.length()-1);
    	}
    }

}