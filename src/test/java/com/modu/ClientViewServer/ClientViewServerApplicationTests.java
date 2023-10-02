package com.modu.ClientViewServer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientViewServerApplicationTests {

	@Test
	void contextLoads() {
		MyService myService = applicationContext.getBean(MyService.class);
		assertNotNull(myService);
		assertTrue(myService.isInitialized());
	}

}
