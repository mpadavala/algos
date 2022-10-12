package com.algos;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */


public class IsmorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
		
	    if(s.length() != t.length()) return false;
	    
	    Map<Character, Character> map = new HashMap<Character, Character>();
	    Map<Character, Character> mapped = new HashMap<Character, Character>();   
	        
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    
	    for(int i=0; i<s.length(); i++) {
	    	char char1 = str1[i];
	    	char char2 = str2[i];
	    	if(map.containsKey(char1)) {
	    		if(! map.get(char1).equals(char2)) return false;
	    	}else {
	    		if(mapped.containsKey(char2)) return false;
	    		map.put(char1, char2);
	    		mapped.put(char2, char2);
	    	}
	    }
	    return true;
	}
}
