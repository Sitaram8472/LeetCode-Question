class Solution {
  public long countSubarrays(int[] nums, long k) {
      int n = nums.length;
      long cnt = 0;
      long sum = 0;
      int left = 0;

      for (int i = 0; i < n; i++) {
          sum += nums[i];
          while (sum * (i - left + 1) >= k) {
              sum -= nums[left];
              left++;
          }
          cnt += i - left + 1;
      }
      return cnt;
  }
}