class Q_1287 {
  public int findSpecialInteger(int[] arr) {
    int n = arr.length;
    if (n == 1) {
      return arr[0];
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
      if (map.get(num) > Math.floor(n / 4.0)) {
        return num;
      }
    }

    return 0;

  }
}