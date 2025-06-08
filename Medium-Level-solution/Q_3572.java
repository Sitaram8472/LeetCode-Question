import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q_3572 {
    public int maxSumDistinctTriplet(int[] x, int[] y) { 

        int n = x.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(x[i], Math.max(map.getOrDefault(x[i], 0), y[i]));
        }

        if(map.size() < 3){
            return -1;
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        return list.get(0)+list.get(1)+list.get(2);
        
    }
}
