import java.util.Arrays;
import java.util.Comparator;

public class Q_2099 {
  public int[] maxSubsequence(int[] nums, int k) {

    int n = nums.length;
    int[][] arr = new int[n][2];
    for (int i = 0; i < n; i++) {
      arr[i][0] = i;
      arr[i][1] = nums[i];
    }

    Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

    int[][] res = new int[k][2];
    for (int i = n - k, j = 0; i < n; i++, j++) {
      res[j][0] = arr[i][0];
      res[j][1] = arr[i][1];
    }

    Arrays.sort(res, Comparator.comparingDouble(o -> o[0]));

    int[] res2 = new int[k];
    for (int i = 0; i < k; i++) {
      res2[i] = res[i][1];
    }
    return res2;
  }
}
