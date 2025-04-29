import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q_2206 {
  public boolean divideArray(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int j : map.values()) {
      if (j % 2 != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];
    for(int i=0; i<n; i++){
      nums[i] = sc.nextInt();
    }
    Q_2206 solution = new Q_2206();
    System.out.println(solution.divideArray(nums));
     sc.close();
     
  }

}