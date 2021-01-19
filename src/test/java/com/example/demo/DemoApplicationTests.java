package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private HelloRestController controller;
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
