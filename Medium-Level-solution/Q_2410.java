import java.util.Arrays;

public class Q_2410 {
  public int matchPlayersAndTrainers(int[] players, int[] trainers) {
    int p = players.length;
    int t = trainers.length;

    Arrays.sort(players);
    Arrays.sort(trainers);

    int cnt = 0;

    int i = 0;
    int j = 0;
    while (i < p && j < t) {
      if (players[i] <= trainers[j]) {
        i++;
        cnt++;
      }
      j++;
    }
    return cnt;

  }

}
