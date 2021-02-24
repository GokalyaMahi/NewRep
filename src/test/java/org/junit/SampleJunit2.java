package org.junit;

public class SampleJunit2 {
	
	@Test
	public void test11() {
		System.out.println("Test11");
	}
	
	@Test
	public void test12() {
		System.out.println("Test12");
		Assert.assertTrue(false);

	}
	
	@Ignore
	@Test
	public void test13() {
		System.out.println("Test13");

	}


}
