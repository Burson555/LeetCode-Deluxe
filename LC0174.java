// WRONG SOLUTION
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int health[]    = new int[dungeon[0].length+1];
        int surplus[]   = new int[dungeon[0].length+1];
        for (int i = 0; i < surplus.length; i++) surplus[i] = 0;
        health[0] = Integer.MAX_VALUE;
        health[1] = (dungeon[0][0] <= 0) ? (1-dungeon[0][0]) : 1;
        surplus[1] = dungeon[0][0];
        for (int i = 2; i < health.length; i++) {
            if (health[i-1] + surplus[i-1] + dungeon[0][i-1] <= 0) {
                // health[i]   = health[i-1] + 1 - (health[i-1] + surplus[i-1] + dungeon[0][i-1]) - surplus[i-1];
                health[i]   = 1 - (surplus[i-1] + dungeon[0][i-1]);
                surplus[i]  = surplus[i-1] + dungeon[0][i-1];
            } else {
                health[i]   = health[i-1];
                surplus[i]  = surplus[i-1] + dungeon[0][i-1];
            }
        }
        for (int k = 1; k < health.length; k++)
            System.out.print(health[k]+" ");
        System.out.print("\n");
        for (int j = 1; j < dungeon.length; j++) {
            for (int i = 1; i < health.length; i++) {
                int prev_health;
                int prev_surplus;
                if (health[i-1] < health[i]) {
                    prev_health     = health[i-1];
                    prev_surplus    = surplus[i-1];
                } else {
                    prev_health     = health[i];
                    prev_surplus    = surplus[i];
                }
                if (prev_health + prev_surplus + dungeon[j][i-1] <= 0) {
                    // health[i]   = prev_health + 1 - (prev_health + prev_surplus + dungeon[j][i-1]) - prev_surplus;
                    health[i]   = 1 - (prev_surplus + dungeon[j][i-1]);
                    surplus[i]  = prev_surplus + dungeon[j][i-1];
                } else {
                    health[i]   = prev_health;
                    surplus[i]  = prev_surplus + dungeon[j][i-1];
                }
            }
            for (int k = 1; k < health.length; k++)
                System.out.print(health[k]+" ");
            System.out.print("\n");
        }
        return health[health.length-1];
    }
}