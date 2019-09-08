import java.util.*;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
    int cnt = k;
    List<T> arr = items;
    List<T> newArr = new ArrayList<>();
    while (arr.size() > 0) {
      for (int i = 0; i < arr.size(); i++) {
        cnt--;
        if (cnt == 0) {
          newArr.add(arr.get(i));
          arr.remove(i);
          i--;
          cnt = k;
        }
      }
    }
    return newArr;
  }
}
