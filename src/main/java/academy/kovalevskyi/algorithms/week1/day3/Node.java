package academy.kovalevskyi.algorithms.week1.day3;

import java.util.HashMap;
import java.util.Map;

public class Node {
  //todo
  public Map<Node, Integer> connections = new HashMap<>();
  public Integer distance = Integer.MAX_VALUE;
}
