import java.util.*;

public class Solution {
    /**
     * 
     * @param boxes int整型二维数组 
     * @return int整型
     */
    public int maxBoxes (int[][] boxes) {
    	// ***********************
        Arrays.sort(boxes, (a, b) -> a[0] - b[0]);
        Arrays.sort(boxes, (a, b) -> a[1] - b[1]);
        Arrays.sort(boxes, (a, b) -> a[2] - b[2]);
    	// ***********************
    	int n = boxes.length;
    	int dp[] = new int[n];
    	Arrays.fill(dp, 1);
    	// ***********************
    	for (int i = 0; i < n; i++) {
    		for (int j = i+1; j < n; j++) {
    			if (boxes[j][0] > boxes[i][0] &&
    				boxes[j][1] > boxes[i][1] &&
    				boxes[j][2] > boxes[i][2])
    				dp[j] = Integer.max(dp[j], dp[i]+1);
    		}
    	}
    	// ***********************
    	int res = dp[0];
    	for (int i = 1; i < n; i++) 
    		res = (dp[i] > res) ? dp[i] : res;
    	return res;
    }
}