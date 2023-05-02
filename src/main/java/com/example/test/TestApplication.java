package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Objects;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		int[] case1 = new int[]{1, 31, 5, 5, 5, 27, 12, 26, 31, 12, 26, 3};
		// Given an array of numbers, return the sum of the numbers that are not repeated.
		assertEquals(getSum(case1), 31);

		int[] case2 = new int[]{2,5,5,25,25,1,2,8,31,8};
		assertEquals(getSum(case2), 32);
		System.out.println("SUCCESS!!");

	}
	private static <T> void assertEquals(T actual, T expected) {
		if (!Objects.equals(actual, expected))
			throw new IllegalStateException(String.format("Expected value: <%s> but was: <%s>", expected, actual));
	}

	private static Integer getSum(int[] array) {
		int total = 0;
		for (Integer numberArray : array) {
			if (Arrays.stream(array).filter(it -> it == numberArray).count() == 1) {
				total = total + numberArray;
			}
		}

		return total;
	}

}
