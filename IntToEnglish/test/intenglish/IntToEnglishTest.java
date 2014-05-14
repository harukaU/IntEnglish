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
	private void assertThat(String actual, String expected) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void test2() {
		IntToEng ie=new IntToEng();
		String expected="twenty one";
		String actual=ie.translateEng(21);
		assertThat(actual, expected);
	}


}
