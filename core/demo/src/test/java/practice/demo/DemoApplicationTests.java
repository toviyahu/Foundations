package practice.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	/**
	 * 
	 */
	@Test
	void contextLoads() {

		DemoApplication demo = new DemoApplication();

		String world = "Hello World!";

		assertEquals("Hello World!", demo.Hello(world));


	
	


	}

	

}
