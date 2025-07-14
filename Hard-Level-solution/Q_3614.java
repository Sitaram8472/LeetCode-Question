public class Q_3614 {
  public char processStr(String s, long k) {

    // List<Character> ops = new ArrayList<>();
    // List<Long> lengths = new ArrayList<>();
    // long length = 0;

    // for (int i = 0; i < s.length(); i++) {
    // char ch = s.charAt(i);

    // if (ch >= 'a' && ch <= 'z') {
    // length++;
    // ops.add(ch);
    // lengths.add(length);
    // } else if (ch == '*') {
    // if (length > 0) {
    // length--;
    // ops.add('*');
    // lengths.add(length);
    // }
    // } else if (ch == '%') {
    // ops.add('%');
    // lengths.add(length);
    // } else if (ch == '#') {
    // if (length * 2 > 1_000_000_000_000_000L) {
    // return '.';
    // }
    // length *= 2;
    // ops.add('#');
    // lengths.add(length);
    // }
    // }

    // if (k >= length)
    // return '.';

    // for (int i = ops.size() - 1; i >= 0; i--) {
    // char op = ops.get(i);
    // long currLength = lengths.get(i);

    // if (op == '*') {
    // if (k >= currLength)
    // k++;
    // } else if (op == '#') {
    // long half = currLength / 2;
    // if (k >= half) {
    // k -= half;
    // }
    // } else if (op == '%') {
    // k = currLength - 1 - k;
    // } else {
    // if (k == currLength - 1) {
    // return op;
    // }
    // }
    // }
    // return '.';

    long len = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch == '*') {
        if (len > 0) {
          len--;
        }
      } else if (ch == '#') {
        len *= 2;
      } else if (ch == '%') {
        continue;
      } else {
        len++;
      }
    }

    if (k >= len) {
      return '.';
    }

    for (int i = s.length() - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      if (ch == '*') {
        len++;
      } else if (ch == '#') {
        len /= 2;
        if (k >= len) {
          k = k - len;
        }
      } else if (ch == '%') {
        k = len - k - 1;
      } else {
        len--;
        if (k == len) {
          return ch;
        }
      }
    }
    return '.';
  }
}
