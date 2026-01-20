class Solution {
    public boolean isIsomorphic(String s, String t) {
    char[] a = new char[128]; // maps s to t
    char[] b = new char[128]; // maps t to s

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        char dh = t.charAt(i);

        if (a[ch] == 0 && b[dh] == 0) {
            // map ch to dh and dh to ch
            a[ch] = dh;
            b[dh] = ch;
        } else if (a[ch] != dh || b[dh] != ch) {
            // mapping doesn't match, return false
            return false;
        }
    }
    return true; // strings are isomorphic
  }
}