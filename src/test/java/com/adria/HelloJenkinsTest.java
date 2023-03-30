package com.adria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adria.jenkins.HelloJenkins;
@SpringBootTest
public class HelloJenkinsTest {

	@Autowired
	private HelloJenkins helloJenkins;
	@Test
	void testHelloJenkins() {

		assertEquals(helloJenkins.sum(1, 1), 2);
		
	}

	
}
