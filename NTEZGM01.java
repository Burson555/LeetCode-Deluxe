import java.util.*;
import java.lang.StringBuilder;

public class Solution {
    /**
     * 接收两个表示9进制数的字符串，返回表示它们相加后的9进制数的字符串
     * @param num1 string字符串 第一个加数
     * @param num2 string字符串 第二个加数
     * @return string字符串
     */
    public String add (String num1, String num2) {
        // ***********************
        int pos = num1.indexOf(".");
        String i1 = "", f1 = "";
        if (pos == -1) {
            i1 = num1;
        } else {
            i1 = num1.substring(0, pos); 
            f1 = num1.substring(pos+1, num1.length()); 
        }
        pos = num2.indexOf(".");
        String i2 = "", f2 = "";
        if (pos == -1) {
            i2 = num2;
        } else {
            i2 = num2.substring(0, pos); 
            f2 = num2.substring(pos+1, num2.length()); 
        }
        // ***********************
        if (f1.length() > 0 || f2.length() > 0) {
            int length = Integer.max(f1.length(), f2.length());
            StringBuilder sb = new StringBuilder();
            if (f1.length() < length) {
                sb.append(f1);
                int n = length - f1.length();
                for (int i = 0; i < n; i++)
                    sb.append('0');
                f1 = sb.toString();
            }
            if (f2.length() < length) {
                sb.append(f2);
                int n = length - f2.length();
                for (int i = 0; i < n; i++)
                    sb.append('0');
                f2 = sb.toString();
            }
        }
        // ***********************
        int n = f1.length(), carryout = 0;
        char res_f[] = new char[n];
        for (int i = n-1; i >= 0; i--) {
            int temp = (f1.charAt(i)-'0')+(f2.charAt(i)-'0')+carryout;
            res_f[i] = (char)(temp%9 + '0');
            carryout = temp/9;
        }
        n = i1.length();
        char res_i[] = new char[n];
        for (int i = n-1; i >= 0; i--) {
            int temp = (i1.charAt(i)-'0')+(i2.charAt(i)-'0')+carryout;
            res_i[i] = (char)(temp%9 + '0');
            carryout = temp/9;
        }
        // ***********************
        String res = "";
        if (carryout != 0) res = "1";
        res += new String(res_i);
        if (f1.length() > 0 || f2.length() > 0) {
            res += ".";
            res += new String(res_f);
        }
        return res;
    }
}