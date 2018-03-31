package com.mkyong.web.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloControllerTest {
	
	@Test
	public void helloTest() throws Exception {
		
		  assertEquals("zzz.txt", "zzz.txt");
		
//		standaloneSetup(new HelloController()).build()
//			.perform(get("/hello/seshu"))
//			.andExpect(status().isOk());
//			.andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
//			.andExpect(content().string("Hello world!"));
	}

}