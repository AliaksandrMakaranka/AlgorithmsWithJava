package academy.kovalevskyi.algorithms.week0.day0;

import java.util.Comparator;

public interface Sort {

  default <T extends Comparable<? super T>> void sort(final T[] target) {
    sort(target, T::compareTo);
  }


  //it's outside buffer from JCB, interface public always?
  public static <T> void buffer(T[] target, int i, int j) {
    T buffer = target[i];
    target[i] = target[j];
    target[j] = buffer;
  }

  //algorithmic complexity O(N^2)
  default <T> void sort(final T[] target, final Comparator<T> comparator) {
    for (int i = 0; i < target.length; i++) {
      for (int j = 0; j < target.length - i - 1; j++) {
        if (comparator.compare(target[j], target[j + 1]) > 0) {
          buffer(target,j, j + 1);
        }
      }
    }
  }

  default <T> T[] createSortedArray(final T[] target, final Comparator<T> comparator) {
    return null;//todo
  }

  default String complexityBest() {
    return "N";
  }

  default String complexityAverage() {
    return "N^2";
  }

  default String complexityWorst() {
    return "N^2";
  }

  default String spaceComplexityWorst() {
    return "N";
  }
}
