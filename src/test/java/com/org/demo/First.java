package com.org.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	@BeforeTest
	public static void beforeTest1() {
		System.out.println("1111111:beforeTest1 classm1");
	}
	@BeforeClass
	public static void beforeclass1() {
		System.out.println("AAA: beforeclass1 classm1");
	}
	@BeforeMethod
	public static void beforemethodm1() {
		System.out.println("BB:beforemethodm1 classm1");
	}
	@Test
	public static void m1() {
		System.out.println("1:Hellow world11");
	}
	@Test
	public static void m2() {
		System.out.println("2:Hellow world11");
	}
	@AfterMethod
	public static void aftermethodm2() {
		System.out.println("YYYY:aftermethod classm1");
	}
	@AfterClass
	public static void afterclass1() {
		System.out.println("ZZZZ: afterclass1 classm1");
	}
	@AfterTest
	public static void AfterTest1() {
		System.out.println("1111111:AfterTest classm1");
	}
	@AfterSuite
	public static void AfterSuite1() {
		System.out.println("000000:AfterSuite classm1");
	}
	@BeforeSuite
	public static void bBeforeSuite() {
		System.out.println("000000:@BeforeSuite classm1");
	}
}
