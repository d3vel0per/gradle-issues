package org.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloWorld {
	@Test
	public void testHelloWorld() {
		assertEquals("Hello World!", HelloWorld.helloWorld());
	}
}
