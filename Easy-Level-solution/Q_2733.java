public class Q_2733 {
  public int findNonMinOrMax(int[] nums) {

    // method 1;
    // Arrays.sort(nums);
    // if(nums.length < 3){
    // return -1;
    // }
    // return nums[1];

    // method2

    int n = nums.length;
    if (n < 3) {
      return -1;
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[i]);
    }
    for (int i = 0; i < n; i++) {
      if (nums[i] != max && nums[i] != min) {
        return nums[i];
      }
    }
    return -1;
  }
}
