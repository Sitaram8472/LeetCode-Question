import java.util.HashSet;

public class Q_961 {
  
    public int repeatedNTimes(int[] nums) {
      // method 1
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
             if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;

        // method 2
        
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for(int cnt : map.keySet()){
        //     if(map.get(cnt) > 1){
        //         return cnt;
        //     }
        // }
       
        // return -1;
    }

}
