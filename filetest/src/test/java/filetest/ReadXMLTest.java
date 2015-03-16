package filetest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.apache.commons.configuration.HierarchicalConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.naoki.ReadXML;



public class ReadXMLTest {
	
	private ReadXML readxml;
	private @Mocked List<HierarchicalConfiguration> hierarchicalConfigurations;

	@Before
	public void setUp() throws Exception {
		readxml = new ReadXML();
	}

	@Test
	public void shouldReturnFalseIfInputIsSmallerThanZero() {
		assertThat(readxml.validateInput(-7), is(false));
	}
	
	@Test
	public void test2() {
		new NonStrictExpectations() {{
			hierarchicalConfigurations.isEmpty(); result = false;
	    }};
	    
	    assertThat(hierarchicalConfigurations.isEmpty(), is(false));
	}
	
	

}
