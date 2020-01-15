// Runtime: 1 ms, faster than 98.89% of Java online submissions for Two City Scheduling.
// Memory Usage: 39 MB, less than 61.11% of Java online submissions for Two City Scheduling.
import java.util.Random;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        int difference_A[] = new int[costs.length];
        int difference_B[] = new int[costs.length];
        for (int i = 0; i < costs.length; i++) {
            difference_A[i] = 1000;
            difference_B[i] = 1000;
        }
        
        int count_A = 0;
        int result = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i][0] <= costs[i][1]) {
                count_A++;
                result += costs[i][0];
                difference_A[i] = costs[i][1] - costs[i][0];
            } else {
                result += costs[i][1];
                difference_B[i] = costs[i][0] - costs[i][1];
            }
        }
        
        int num_changes;
        int difference[];
        if (count_A >= costs.length/2){
            difference = difference_A;
            num_changes = count_A - costs.length/2;
        }
        else {
            difference = difference_B;
            num_changes = costs.length/2 - count_A;
        }
        this.myRQS(difference, 0, difference.length-1);
        
        for (int i = 0; i < num_changes; i++)
            result += difference[i];
        return result;
    }
    
    private void myRQS(int difference[], int low, int high) {
        if (low >= high)
            return;
        Random r = new Random();
        int pivot = r.nextInt(high - low + 1) + low;
        this.swap(difference, pivot, high);
        int k = this.partition(difference, low, high);
        this.myRQS(difference, low, k-1);
        this.myRQS(difference, k+1, high);
    }
    
    private int partition(int difference[], int low, int high) {
        int i = low;
        for (int j = low; j < high + 1; j++) {
            if (difference[j] < difference[high])
                this.swap(difference, j, i++);
        }
        this.swap(difference, i, high);
        return i;
    }
    
    private void swap(int difference[], int a, int b) {
        int temp = difference[a];
        difference[a] = difference[b];
        difference[b] = temp;
    }
}