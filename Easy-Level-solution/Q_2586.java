public class Q_2586 {
  public int vowelStrings(String[] words, int left, int right) {
    int n = words.length;
    String vowel = "aeiou";
    int count = 0;
    for (int i = left; i <= right; i++) {
      String str = words[i];
      char start = str.charAt(0);
      char end = str.charAt(str.length() - 1);
      if (vowel.indexOf(start) != -1 && vowel.indexOf(end) != -1) {
        count++;
      }
    }
    return count;
  }
}
