class Solution {
    public int minSteps(String s, String t) {
        int ca[] = new int[26];
        for (int i = 0; i < 26; i++) ca[i] = 0;
        for (int i = 0; i < s.length(); i++) {
            ca[s.charAt(i)-'a']++;
            ca[t.charAt(i)-'a']--;
        }
        int count = 0;
        for (int i = 0; i < 26; i++){
            count += (ca[i] < 0) ? -ca[i] : ca[i];}
        return count/2;
    }
}