public class Q_2575 {
  public int[] divisibilityArray(String word, int m) {
    int n = word.length();
    int[] arr = new int[n];
    long rem = 0;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      int currdigit = ch - '0';
      rem = ((rem * 10) + currdigit) % m;
      arr[i] = (rem == 0) ? 1 : 0;
    }
    return arr;

  }
}
