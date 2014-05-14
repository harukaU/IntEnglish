package intenglish;

import org.junit.Test;


public class IntToEnglishTest {

	@Test
	public void test1() {
		IntToEng ie=new IntToEng();
		String expected="one";
		String actual=ie.translateEng(1);
		assertThat(actual, expected);
	}

	@Test
	public void test2() {
		IntToEng ie=new IntToEng();
		String expected="twenty one";
		String actual=ie.translateEng(21);
		assertThat(actual, expected);
	}
	@Test
	public void test3() {
		IntToEng ie=new IntToEng();
		String expected="two hundred fifty four";
		String actual=ie.translateEng(254);
		assertThat(actual, expected);
	}
	@Test
	public void test4() {
		IntToEng ie=new IntToEng();
		String expected="thousand";
		String actual=ie.translateEng(1000);
		assertThat(actual, expected);
	}

	private void assertThat(String actual, String expected) {
		// TODO Auto-generated method stub
		
	}


}
