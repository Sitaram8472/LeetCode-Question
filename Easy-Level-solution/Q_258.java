public class Q_258 {

  public int addDigits(int num) {
    return res(num);

  }

  public static int res(int n) {
    if (n < 10) {
      return n;
    }
    

    while (n > 9) {
      int ans = 0;
      while (n > 0) {
        int rem = n % 10;
        ans += rem;
        n /= 10;
      }
      n = ans;

    }
    return n;
  }
}
