public class Q_287 {

  public int findDuplicate(int[] nums) {

    // method 1
    // HashSet<Integer> set = new HashSet<>();
    // for(int i : nums){
    // if(!set.add(i)){
    // return i;
    // }
    // }
    // return 0;

    // method 2 cyclic sort

    while (true) {
      int s = nums[0];
      if (nums[s] == s) {
        return s;
      }
      nums[0] = nums[s];
      nums[s] = s;
    }

  }

}
