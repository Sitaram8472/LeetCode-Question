import java.util.Arrays;

public class Q_2294 {
  public int partitionArray(int[] nums, int k) {
    Arrays.sort(nums);
    int ans = 1;
    int start = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] - start > k) {
        ans++;
        start = nums[i];
      }
    }
    return ans;
  }
}