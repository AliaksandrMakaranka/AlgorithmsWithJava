package academy.kovalevskyi.algorithms.week1.day1;

public class XoBoard {

  private final XoFigure[][] state = new XoFigure[3][3];

  public XoBoard() {
  }

  public XoBoard(XoBoard copy) {
    //todo
  }

  public XoFigure getFigure(int x, int y) {
    //todo
    return null;
  }

  public XoFigure[][] getState() {
    return state;
  }

  public void setFigure(int x, int y, XoFigure xoFigure) {
    //todo
  }

  public XoFigure hasWinner() {
    //todo
    return null;
  }

  public boolean tie() {
    //todo
    return false;
  }

  @Override
  public boolean equals(Object o) {
    //todo
    return false;
  }

  @Override
  public int hashCode() {
    //todo
    return 0;
  }
}
