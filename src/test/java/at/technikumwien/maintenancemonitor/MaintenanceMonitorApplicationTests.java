package at.technikumwien.maintenancemonitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class MaintenanceMonitorApplicationTests {


	MaintenanceMonitor mt = new MaintenanceMonitor();

	@Test
	void getMessageTest(){
			String expected = "";

			String result = mt.getMessage();

			assertEquals(expected,result);
	}

	@Test
	void setMessageTest(){
		String expected = "Service checks: No power until 5:00 pm";
		mt.setMessage(expected);
		String result = mt.getMessage();
		assertEquals(expected,result);
	}


	@Test
	void resetMessage(){
		String given = "Ok";
		mt.setMessage(given);
		mt.resetMessage();
		String result = mt.getMessage();

		assertNotEquals(given,result);
	}


}
