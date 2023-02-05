package iterator;

import java.util.Iterator;

public class IntegerArrayIterator implements Iterator<Integer> {
  private final int[] array;
  private int currentIndex = 0;
  
  public IntegerArrayIterator(int[] array) {
    this.array = array;
  }
  
  @Override
  public boolean hasNext() {
    return currentIndex < array.length;
  }
  
  @Override
  public Integer next() {
    return array[currentIndex++];
  }
}