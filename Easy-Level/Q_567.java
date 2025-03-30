import java.util.Arrays;

public class Q_567 {

  public boolean checkInclusion(String s1, String s2) {
    String s = sort2(s1);

    for (int i = 0; i <= s2.length() - s1.length(); i++) {
      if (s.equals(sort2(s2.substring(i, i + s1.length())))) {
        return true;
      }
    }
    return false;
  }

  public String sort2(String s) {
    char[] t = s.toCharArray();
    Arrays.sort(t);
    return new String(t);
  }

}
