public class Q_2016 {
  public int maximumDifference(int[] nums) {

    // n2
    // int max = Integer.MIN_VALUE;
    // for(int i=0; i<nums.length; i++){
    // for(int j=0; j<nums.length; j++){
    // if(j>i){
    // int diff = nums[j]-nums[i];
    // max = Math.max(diff, max);
    // }
    // }
    // }
    // if(nums.length == 0 || max < 1){
    // return -1;
    // }
    // return max;

    // n

    int max = Integer.MIN_VALUE;
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (j > i && nums[j] > nums[i]) {
        int diff = nums[j] - nums[i];
        max = Math.max(max, diff);
      } else {
        i = j;
      }
    }
    if (max < 1) {
      return -1;
    }
    return max;
  }
}
