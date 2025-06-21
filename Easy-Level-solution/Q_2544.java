public class Q_2544 {
  public int alternateDigitSum(int n) {
    // String str = String.valueOf(n);

    // int[] arr = new int[str.length()];
    // for(int i=0; i<str.length(); i++){
    // arr[i] = str.charAt(i)-'0';
    // }

    // int firstsum = 0;
    // int secondsum = 0;

    // for(int i=0; i<arr.length; i++){
    // if(i % 2 == 0){
    // firstsum += arr[i];
    // } else {
    // secondsum += arr[i];
    // }
    // }
    // return firstsum-secondsum;

    // version code

    int sum = 0;

    String str = String.valueOf(n);

    for (int i = 0; i < str.length(); i++) {
      int digit = str.charAt(i) - '0';
      sum += (i % 2 == 0) ? digit : -digit;
    }

    return sum;

  }
}
