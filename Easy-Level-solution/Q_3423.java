public class Q_3423 {
  public int maxAdjacentDistance(int[] nums) {
    int n = nums.length;
    int last = Math.abs(nums[n - 1] - nums[0]);
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n - 1; i++) {
      max = Math.max(Math.abs(nums[i] - nums[i + 1]), max);
    }
    max = Math.max(max, last);
    return max;
  }
}
