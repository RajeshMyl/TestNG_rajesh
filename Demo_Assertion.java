package com.demo_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Assertion {
	String name = "ChiChi";
	boolean a = true;

	@Test
	public void goku() {

		Assert.assertEquals(name, "ChiChi");
		// Assert.assertNotEquals(name, "ChiChi");
		Assert.assertTrue(a);
	}

}
