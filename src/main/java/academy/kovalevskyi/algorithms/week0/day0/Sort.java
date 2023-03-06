package academy.kovalevskyi.algorithms.week0.day0;

import java.util.Comparator;

public interface Sort {

  default <T extends Comparable<? super T>> void sort(final T[] target) {
    sort(target, T::compareTo);
  }

  default <T> void sort(final T[] target, final Comparator<T> comparator) {
    //todo
  }

  default <T> T[] createSortedArray(final T[] target, final Comparator<T> comparator) {
    //todo
    return target;
  }

  default String complexityBest() {
    //todo
    return "O(1)";
  }

  default String complexityAverage() {
    //todo
    return "";
  }

  default String complexityWorst() {
    //todo
    return "";
  }

  default String spaceComplexityWorst() {
    //todo
    return "";
  }


}
