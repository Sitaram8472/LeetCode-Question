public class Q_744 {

  public char nextGreatestLetter(char[] letters, char target) {
    int n = letters.length;

    for (int i = 0; i < n; i++) {
      if (letters[i] > target) {
        return letters[i];
      }
    }
    return letters[0];

  }
}