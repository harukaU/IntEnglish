package intenglish;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatcher.is;

import org.junit.Test;


public class IntToEnglishTest {

	@Test
	public void test1() {
		IntToEng ie=new IntToEng();
		String expected="one";
		String actual=ie.translateEng(1);
		assertThat(actual, is(expected));
	}


}
