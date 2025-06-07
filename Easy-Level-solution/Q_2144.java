import java.util.Arrays;

public class Q_2144 {
  public int minimumCost(int[] cost) {
    Arrays.sort(cost);

    int mincost = 0;
    int cnt = 0;
    for (int i = cost.length - 1; i >= 0; i--) {
      if ((cost.length - i) % 3 != 0) {
        mincost += cost[i];
      }
    }

    return mincost;
  }
}
