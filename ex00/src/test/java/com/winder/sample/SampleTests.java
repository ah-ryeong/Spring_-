package com.winder.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//@RunWith
@ContextConfiguration("files:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
//	@Setter(onMethod = { @Autowired })
//	private Restaurant restaurant;
//	
//	@Test
//	public void testExist() {
//		assertNotNull(restaurant);
//		
//		log.info(restaurant);
//		log.info("---------------------");
//		log.info(res.getChef());
//	}
}
