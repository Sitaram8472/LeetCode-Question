public class Q_3612 {
  public String processStr(String s) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '*') {
        if (sb.length() > 0) {
          sb.deleteCharAt(sb.length() - 1);
        }
      } else if (ch == '#') {
        sb.append(sb);
      } else if (ch == '%') {
        sb.reverse();
      } else {
        sb.append(ch);
      }

    }
    return sb.toString();

  }
}
