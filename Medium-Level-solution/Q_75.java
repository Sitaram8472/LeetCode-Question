public class Q_75 {
    public void sortColors(int[] nums) {

        // method 1
        // int c1 = 0;
        // int c2 = 0;
        // int c3 = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) {
        //         c1++;
        //     } else if (nums[i] == 1) {
        //         c2++;
        //     } else {
        //         c3++;
        //     }
        // }

        // int idx = 0;
        // while (c1 > 0) {
        //     nums[idx++] = 0;
        //     c1--;
        // }
        // while (c2 > 0) {
        //     nums[idx++] = 1;
        //     c2--;
        // }

        // while (c3 > 0) {
        //     nums[idx++] = 2;
        //     c3--;
        // }

        // method 2

        int low = 0;
        int high = nums.length-1;
        int mid  =0;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }

        }
    }
}
