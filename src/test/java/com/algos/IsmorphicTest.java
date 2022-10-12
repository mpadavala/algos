package com.algos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsmorphicTest {

	Ismorphic ismorphic = new Ismorphic();

	@Test
	public void isIsomorphicTest() {
		String s1 = "badc",  s2 = "baba";
		System.out.println(s1 + "," + s2);
		System.out.println(ismorphic.isIsomorphic(s1, s2));
		assertEquals(ismorphic.isIsomorphic(s1, s2), false);
		
		s1 = "egg";  s2 = "add";
		System.out.println(s1 + "," + s2);
		System.out.println(ismorphic.isIsomorphic(s1, s2));
		assertEquals(ismorphic.isIsomorphic(s1, s2), true);
		
	}
}
