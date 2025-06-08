public class Q_2401 {

  public int longestNiceSubarray(int[] nums) {
    int n = nums.length;
    int longestsubarray = 0;
    int start = 0;
    int bit = 0;
    for (int i = 0; i < n; i++) {
      while ((bit & nums[i]) != 0) {
        bit ^= nums[start];
        start++;
      }
      bit |= nums[i];

      longestsubarray = Math.max(longestsubarray, i - start + 1);
    }
    return longestsubarray;

  }

}
