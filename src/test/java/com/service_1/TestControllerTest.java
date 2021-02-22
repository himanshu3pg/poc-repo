package com.service_1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.service_1.controller.TestController;

@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class TestControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testMethod() throws Exception {
		mockMvc.perform(get("/test")).andExpect(content().bytes("success".getBytes()));
	}
}
