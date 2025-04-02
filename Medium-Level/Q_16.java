import java.util.Arrays;

public class Q_16 {

  public int threeSumClosest(int[] nums, int target) {
    int n = nums.length;
    Arrays.sort(nums);
    int sum = Integer.MAX_VALUE;
    int closesum = 0;
    for (int i = 0; i < n; i++) {
      int start = i + 1, end = nums.length - 1;
      while (start < end) {
        int currsum = nums[start] + nums[end] + nums[i];
        if (currsum == target) {
          return currsum;
        } else if (currsum < target) {
          start++;
        } else {
          end--;
        }
        int diff = Math.abs(currsum - target);
        if (diff < sum) {
          sum = diff;
          closesum = currsum;
        }

      }

    }
    return closesum;
  }
}