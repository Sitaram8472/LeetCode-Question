public class Q_1347 {
  public int minSteps(String s, String t) {
    int n = s.length();
    int n2 = t.length();

    int[] freq = new int[26];
    for (char ch : s.toCharArray()) {
      int ch2 = ch - 'a';
      freq[ch2]++;
    }

    for (char ch : t.toCharArray()) {
      int ch2 = ch - 'a';
      freq[ch2]--;
    }
    int ans = 0;
    for (int i = 0; i < 26; i++) {
      ans += Math.max(0, freq[i]);
    }
    return ans;
  }
}
