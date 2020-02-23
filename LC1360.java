class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int c1 = 0, c2 = 0;
        
        int y1 = Integer.parseInt(date1.substring(0, 4));
        int y2 = Integer.parseInt(date2.substring(0, 4));
        c1 += (365*(y1 - 1971) + (y1 - 1971)/4);
        c2 += (365*(y2 - 1971) + (y2 - 1971)/4);
        if ((y1 - 1971)%4 >= 2) c1++;
        if ((y2 - 1971)%4 >= 2) c2++;
        
        int m1 = Integer.parseInt(date1.substring(5, 7));
        int m2 = Integer.parseInt(date2.substring(5, 7));
        c1 += (31*(m1 - 1));
        c2 += (31*(m2 - 1));
        
        if (m1 >= 12) {
            c1 -= 7;
        } else if (m1 >= 10) {
            c1 -= 6;
        } else if (m1 >= 7) {
            c1 -= 5;
        } else if (m1 >= 5) {
            c1 -= 4;
        } else if (m1 >= 3) {
            c1 -= 3;
        }
        
        if (m2 >= 12) {
            c2 -= 7;
        } else if (m2 >= 10) {
            c2 -= 6;
        } else if (m2 >= 7) {
            c2 -= 5;
        } else if (m2 >= 5) {
            c2 -= 4;
        } else if (m2 >= 3) {
            c2 -= 3;
        }
        if (m1 >= 3 && (y1 - 1971)%4 == 1) c1++;
        if (m2 >= 3 && (y2 - 1971)%4 == 1) c2++;
        
        int d1 = Integer.parseInt(date1.substring(8, 10));
        int d2 = Integer.parseInt(date2.substring(8, 10));
        // System.out.println(d1);
        // System.out.println(d2);
        c1 += (d1 - 1);
        c2 += (d2 - 1);
        
        return Math.abs(c1-c2);
    }
}