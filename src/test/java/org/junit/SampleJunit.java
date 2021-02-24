package org.junit;

public class SampleJunit {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");

	}
	
	@Test
	public void test2() {
		System.out.println("Test2");

	}


}
