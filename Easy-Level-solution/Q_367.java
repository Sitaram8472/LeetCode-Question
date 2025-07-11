public class Q_367 {
  public boolean isPerfectSquare(int num) {
    // if(num == 1){
    // return true;
    // }
    // for(int i=0; i<=num/2; i++){
    // if(i*i == num) return true;
    // if(i*i > num) break;
    // }
    // return false;

    int left = 0;
    int right = num;
    if (num == 1) {
      return true;
    }

    while (left < right) {
      int mid = (left + right) / 2;
      long sq = (long) mid * mid;

      if (sq == num) {
        return true;
      } else if (sq < num) {
        left = mid + 1;
      } else {
        right = mid;
      }

    }
    return false;
  }
}
