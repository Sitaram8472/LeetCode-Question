public class Q_2566 {
  public int minMaxDifference(int num) {
    String str = Integer.toString(num);
    String str2 = Integer.toString(num);

    char max = ' ';
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != '9') {
        max = str.charAt(i);
        break;
      }

    }

    char min = ' ';
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != '0') {
        min = str.charAt(i);
        break;
      }

    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == max) {
        str = str.replace(str.charAt(i), '9');
      }

      if (str2.charAt(i) == min) {
        str2 = str2.replace(str2.charAt(i), '0');
      }

    }

    return Integer.parseInt(str) - Integer.parseInt(str2);

  }
}
