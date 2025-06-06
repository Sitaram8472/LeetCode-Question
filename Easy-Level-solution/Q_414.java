import java.util.Arrays;

public class Q_414 {
  public int thirdMax(int[] nums) {
    Arrays.sort(nums);
    if (nums.length == 2) {
      return nums[1];
    }
    if (nums.length == 1) {
      return nums[0];
    }

    int cnt = 1;

    for (int i = nums.length - 1; i > 0; i--) {
      if (nums[i] != nums[i - 1]) {
        cnt++;
        if (cnt == 3) {
          return nums[i - 1];
        }
      }

    }

    return nums[nums.length - 1];
  }
}
