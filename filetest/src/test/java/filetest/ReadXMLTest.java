package filetest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.naoki.ReadXML;

public class ReadXMLTest {
	
	private ReadXML readxml;
	

	@Before
	public void setUp() throws Exception {
		readxml = new ReadXML();
	}

	@Test
	public void shouldReturnFalseIfInputIsSmallerThanZero() {
		assertThat(readxml.validateInput(-7), is(false));
	}
	
	

}
