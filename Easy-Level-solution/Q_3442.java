public class Q_3442 {
  public int maxDifference(String s) {
    int n = s.length();

    int arr[] = new int[26];
    for (int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      arr[ch - 'a']++;
    }
    int oddmax = 0;
    int evenmax = Integer.MAX_VALUE;
    for (int i = 0; i < 26; i++) {
      if (arr[i] % 2 != 0) {
        oddmax = Math.max(oddmax, arr[i]);
      } else {
        if (arr[i] > 0) {
          evenmax = Math.min(evenmax, arr[i]);
        }

      }
    }

    return oddmax - evenmax;

  }
}
