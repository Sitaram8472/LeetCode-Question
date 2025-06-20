public class Q_3443 {

  public int maxDistance(String s, int k) {
    int ans = 0;

    int e = 0;
    int w = 0;
    int n = 0;
    int s1 = 0;
    for (int i = 0; i < s.length(); i++) {

      char ch = s.charAt(i);
      if (ch == 'E') {
        e++;
      } else if (ch == 'W') {
        w++;
      } else if (ch == 'N') {
        n++;
      } else {
        s1++;
      }

      int x = Math.abs(n - s1);
      int y = Math.abs(e - w);

      int mahaton = x + y;
      int distance = mahaton + Math.min(2 * k, i + 1 - mahaton);
      ans = Math.max(ans, distance);
    }

    return ans;
  }
}