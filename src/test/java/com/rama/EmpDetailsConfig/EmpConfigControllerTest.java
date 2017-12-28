
package com.rama.EmpDetailsConfig;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.env.MockEnvironment;

public class EmpConfigControllerTest {

	private EmpConfigController subject;
	
	@Before
	public void setup(){
		subject = new EmpConfigController();
	}
	
	@Test
	public void itShouldPrintTheNameSetInEnvironment(){
		MockEnvironment environment = new MockEnvironment();
		environment.setProperty(EmpConfigController.EMP_NAME, "Rama");
		subject.setEnvironment(environment);
		String greeting = subject.greet();
		assertEquals("Hello Rama !!", greeting);
		
	}
}
