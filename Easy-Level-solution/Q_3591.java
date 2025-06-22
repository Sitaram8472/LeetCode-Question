public class Q_3591 {
   public boolean checkPrimeFrequency(int[] nums) {

        int n = nums.length;
        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {
            arr[nums[i]]++;
        }

        for (int i = 0; i < 101; i++) {
            if(arr[i] <= 1){
                continue;
            }
            if (arr[i] > 1) {
                if (isprime(arr[i])) {
                    return true;
                }
            }

        }
        return false;

    }

    private boolean isprime(int num) {
        for (int j = 2; j<= (int)Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
