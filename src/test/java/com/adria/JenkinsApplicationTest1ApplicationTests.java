package com.adria;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTest1ApplicationTests {

	@Autowired
	HelloJenkins helloJenkins;

	@Test
	void contextLoads() {
		assertThat(helloJenkins.sum(1, 0)).isEqualTo(1);
		}

}
