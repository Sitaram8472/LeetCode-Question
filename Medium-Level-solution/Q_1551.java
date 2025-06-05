public class Q_1551 {
  public int minOperations(int n) {
    int oper = 0;

    for (int i = 1; i < n; i += 2) {  
      oper += (n - i);
    }

    return oper;

  }
}