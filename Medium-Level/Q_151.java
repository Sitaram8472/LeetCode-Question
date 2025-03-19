public class Q_151 {
  public String reverseWords(String str) {
    String[] word = str.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
    for (int i = word.length - 1; i >= 0; i--) {
      sb.append(word[i]);
      if (i > 0) {
        sb.append(" ");
      }
    }
    return sb.toString();

  }

}