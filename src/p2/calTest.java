package p2;

import static org.junit.Assert.*;

import org.junit.Test;

import p1.calc;
public class calTest {
	
	@Test
public	void test() {
		calc test=new calc();
		assertEquals(2,calc.add(1,1));
	}
	@Test
	public void testSum_BothNumbersAreneg_ShouldReturnnegNumber() {
		calc test=new calc();
		assertEquals(-2,calc.add(-1,-1));
}
	@Test
	public void testSum_differentandgretherispositive_ShouldReturnPositiveNumber() {
		assertEquals(4,calc.add(5,-1));

	}
	@Test
	public void testSum_differentandgretherisneg_ShouldReturnnegNumber() {
		assertEquals(-4,calc.add(-5,1));

	}
	@Test
	public void testSum_sameanddifferentsign_ShouldReturnzero() {
		assertEquals(0,calc.add(-5,5));

	}
	
	@Test
	public void testSum_addingzero_ShouldReturnsamenumber() {
		assertEquals(5,calc.add(0,5));

	}

}
