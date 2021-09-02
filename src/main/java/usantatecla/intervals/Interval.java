package usantatecla.intervals;

public class Interval {

  private int min;
  private int max;

  public Interval(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public boolean isIncluded(int value) {
    return min <= value && value <= max;
  }

  public boolean isIncluded(Interval interval) {
    return this.isIncluded(interval.min) &&
      this.isIncluded(interval.max);
  }

}
