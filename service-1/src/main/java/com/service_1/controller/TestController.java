package com.service_1.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/test")
	public String test() throws InterruptedException {
		Random r = new Random();
		/*if (r.nextInt(10) == 2) {
			throw new RuntimeException();
		}*/
		// Thread.sleep(1000);
		return "success";
	}
}
