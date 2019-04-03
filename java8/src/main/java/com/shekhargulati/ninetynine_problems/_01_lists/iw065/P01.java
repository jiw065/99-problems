package com.shekhargulati.ninetynine_problems._01_lists.iw065;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * (*) Find the last element of a list.
 * <p>
 * Check P01Test class for test cases related to this problem.
 */
public class P01{
	/**
	 * NOTE:the usage of generic types 
	 * 1.has to be upper cases
	 * 2.the ITEM type is wriiten as <ITEM> ITEM when return
	 */
	public static <T> T last(LinkedList<T> l) {
		T a = l.getLast();
		return a;
	}
	
	public static <T> void insert(T a) {
		
		
	}

	
}
