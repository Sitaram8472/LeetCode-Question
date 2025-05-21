public class Q_2256 {

  public int minimumAverageDifference(int[] nums) {
    int n = nums.length;
    int idx = 0;
    long ans = Integer.MAX_VALUE;

    if (n == 1) {
      return 0;
    }
    long prefix = 0;
    for (int j = 0; j < n; j++) {
      prefix += nums[j];
    }

    long sum = 0;
    for (int i = 0; i < n; i++) {
      prefix -= nums[i];
      sum = sum + nums[i];
      long avg = sum / (i + 1);
      long totalavg = (i == n - 1) ? Math.abs(avg) : Math.abs(avg - (prefix / (n - i - 1)));
      if (totalavg < ans) {
        ans = totalavg;
        idx = i;
      }

    }
    return idx;
  }
}
