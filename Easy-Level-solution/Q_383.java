import java.util.HashMap;
import java.util.Map;

public class Q_383 {
  public boolean canConstruct(String ransomNote, String magazine) {

    Map<Character, Integer> freq1 = new HashMap<>();
    Map<Character, Integer> freq2 = new HashMap<>();

    for (char ch : ransomNote.toCharArray()) {
      freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
    }

    for (char ch : magazine.toCharArray()) {
      freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
    }

    for (char n : freq1.keySet()) {
      if (freq2.getOrDefault(n, 0) < freq1.get(n)) {
        return false;
      }
    }
    return true;
  }
}
