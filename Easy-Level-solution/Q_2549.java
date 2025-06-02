public class Q_2549 {
  public int distinctIntegers(int n) {
    int cnt = 1;

    for (int i = n; i > 2; i--) {
      if (n % (n - 1) == 1) {
        cnt++;
      }
    }

    return cnt;
  }
}
