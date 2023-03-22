package academy.kovalevskyi.algorithms.week2.day3;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class WordSearchAction extends RecursiveTask<List<String>> {

  private final TrieNode node;

  public WordSearchAction(TrieNode node) {
    this.node = node;
  }

  @Override
  protected List<String> compute() {
    //todo
    return null;
  }
}
