public class Q_3024 {
  public String triangleType(int[] nums) {

    int sum1 = nums[0] + nums[1];
    int sum2 = nums[0] + nums[2];
    int sum3 = nums[1] + nums[2];

    if (sum1 > nums[2] && sum2 > nums[1] && sum3 > nums[0]) {

      if (nums[0] == nums[1] && nums[1] == nums[2]) {
        return "equilateral";
      } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
        return "isosceles";
      } else {
        return "scalene";
      }

    }

    return "none";
  }
}
