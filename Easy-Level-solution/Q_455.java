import java.util.Arrays;

public class Q_455 {
  public int findContentChildren(int[] g, int[] s) {
    int cnt = 0;

    Arrays.sort(g);
    Arrays.sort(s);

    int i = 0;
    int j = 0;
    while (i < g.length && j < s.length) {
      if (g[i] <= s[j]) {
        i++;
        cnt++;
      }
      j++;
    }
    return cnt;

  }
}
