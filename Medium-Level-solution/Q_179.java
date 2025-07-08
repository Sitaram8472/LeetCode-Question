public class Q_179 {
  public String largestNumber(int[] nums) {
        String[] strnum = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strnum[i] = Integer.toString(nums[i]);
        }


        Arrays.sort(strnum, (a, b) -> (b+a).compareTo(a+b));

        if(strnum[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(String str : strnum){
            sb.append(str);
        }

        return sb.toString();

    }
}
