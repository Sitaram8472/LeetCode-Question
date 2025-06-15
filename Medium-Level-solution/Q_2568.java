import java.util.Arrays;

public class Q_2568 {
  public int minImpossibleOR(int[] nums) {
    Arrays.sort(nums);
    int minxor = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > minxor + 1) {
        return minxor + 1;
      }
      minxor = minxor | nums[i];
    }
    return minxor + 1;
  }
}
