public class Q_2575 {
  public int[] leftRightDifference(int[] nums) {
    int n = nums.length;

    int[] ans = new int[n];

    int rightsum = 0;
    for (int i = 0; i < n; i++) {
      rightsum += nums[i];
    }

    int leftsum = 0;
    for (int i = 0; i < n; i++) {
      rightsum -= nums[i];
      ans[i] = Math.abs(leftsum - rightsum);
      leftsum += nums[i];
    }

    return ans;

  }
}
