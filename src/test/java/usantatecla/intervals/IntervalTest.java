package usantatecla.intervals;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class IntervalTest {

	private	Interval interval;
	
	@Before 
	public void before() {
		interval = new Interval(-1,1);
	}

	@Test
	public void test1() {
    assertTrue(interval.isIncluded(0));
	}

	@Test
	public void test2() {
    assertTrue(interval.isIncluded(1));
	}

	@Test
	public void test3() {
    assertFalse(interval.isIncluded(2));
	}

	@Test
	public void test4() {
    assertFalse(interval.isIncluded(-2));
	}

	@Test
	public void test5() {
    Interval interval = new Interval(-2,2);
    assertTrue(interval.isIncluded(new Interval(-1,1)));
	}

	@Test
	public void test6() {
    Interval interval = new Interval(-2,2);
    assertTrue(interval.isIncluded(new Interval(-2,2)));
	}

	@Test
	public void test7() {
    Interval interval = new Interval(-2,2);
    assertFalse(interval.isIncluded(new Interval(-1,5)));
	}

}
