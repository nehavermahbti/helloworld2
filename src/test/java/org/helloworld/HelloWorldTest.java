package org.helloworld;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class HelloWorldTest {

	@Before
	public void init() {
		
	}
	
	@Test
	public void testSayHello() {
		HelloWorld helloworld = new HelloWorld();
		String result = helloworld.sayHello();
		assertEquals("Hello World!!!", result);
	}
}
