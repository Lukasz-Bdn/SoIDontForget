package com.whileiremember.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SendgridApiKeyTest {

	@Test
	public void test() {
		String apiKey = System.getenv("SENDGRID_API_KEY");
		assertTrue(apiKey.length() == 69);
	}
}
