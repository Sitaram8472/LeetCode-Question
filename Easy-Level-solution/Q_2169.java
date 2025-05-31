public class Q_2169 {
  public int countOperations(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
      return 0;
    }

    int oper = 0;
    while (num1 != 0 && num2 != 0) {
      if (num1 >= num2) {
        num1 -= num2;
        oper++;
      } else if (num2 >= num1) {
        num2 -= num1;
        oper++;
      }
    }

    return oper;

  }
}
