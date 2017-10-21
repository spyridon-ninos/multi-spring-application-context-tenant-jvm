package com.ninos.thirdcontext.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdEndpoint {

	private static Logger logger = LoggerFactory.getLogger(ThirdEndpoint.class);

	@GetMapping
	public String helloAthens() {
		logger.info("third endpoint was called");

		try {
			Thread.sleep(1_000);
			logger.error("Throwing the exception");
			throw new OutOfMemoryError("die die die");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "hello athens";
	}
}
