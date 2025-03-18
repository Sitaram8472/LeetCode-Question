public class Q_2529 {
  public int maximumCount(int[] nums) {

      // method 1 (brute force)
  
      // int n = nums.length;
      // int negcnt = 0;
      // int poscnt = 0;
      // for(int i=0; i<n; i++){
      // if(nums[i]>0){
      // poscnt++;
      // }
      // else if(nums[i]<0){
      // negcnt++;
      // }
      // }
      // return Math.max(negcnt, poscnt);
  
      // method 2(Binary search)
  
      // int totalpos = n - pos(nums);
      // int totalneg = zero(nums);
      // return Math.max(totalpos, totalneg);
  
      return Math.max(zero(nums), pos(nums));
  
    }
  
    private int zero(int[] nums) { // >= 0 count
      int n = nums.length;
      int idx = nums.length;
      int left = 0, right = n - 1;
      while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] < 0) {
          left = mid + 1;
        } else if (nums[mid] >= 0) {
          right = mid - 1;
          idx = mid;
        }
      }
      return idx;
    }
  
    private int pos(int[] nums) { // pos count
      int n = nums.length;
      int idx = nums.length;
      int left = 0, right = n - 1;
      while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] <= 0) {
          left = mid + 1;
        } else if (nums[mid] > 0) {
          right = mid - 1;
          idx = mid;
        }
      }
      return n - idx;
    }
  
    public static void main(String[] args) {
      Q_2529 solution = new Q_2529();
      int nums[] = {-2,-1,-1,1,2,3};
      System.out.println(solution.maximumCount(nums));
  }
}