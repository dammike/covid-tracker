package com.dammike.covid.covidtracker;

import com.dammike.covid.covidtracker.services.CovidTrackerService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.io.IOException;

@SpringBootTest
class CovidTrackerApplicationTests {

	@Test
	void testFetchingCSVDataFromServer() throws IOException, InterruptedException {
		CovidTrackerService service = new CovidTrackerService();
		Assert.notNull(service.getAllData(), "CSV data loaded successfully!");
	}

}
