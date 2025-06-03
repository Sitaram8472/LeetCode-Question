import java.util.*;
public class Q_128 {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    int max = 1;
    for (int num : set) {
      if (!set.contains(num - 1)) {
        int currcnt = 1;

        while (set.contains(num + currcnt)) {
          currcnt++;
        }
        max = Math.max(currcnt, max);
      }

    }
    return max;
  }
}