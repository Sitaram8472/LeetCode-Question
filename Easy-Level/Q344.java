public class Q344 {
  class Solution {
    public void reverseString(char[] s) {
        originalstring(s);
    }
    public static void originalstring(char[] s){

        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
}
