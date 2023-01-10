package com.leetcode.exercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

	/*
	 * @Author: Skurnik Franco Daniel, Student of Web Development
	 * 
	 * Welcome people! This is my resolution of next exercise:
	 * 
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order, and each of their nodes
	 * contains a single digit. Add the two numbers and return the sum as a linked
	 * list.
	 * 
	 * You may assume the two numbers do not contain any leading zero, except the
	 * number 0 itself.
	 * 
	 * Constraints:
	 * 
	 * The number of nodes in each linked list is in the range [1, 100]. 
	 * 0 <= Node.val <= 9 
	 * It is guaranteed that the list represents a number that does 
	 * not have leading zeros.
	 */

	private static LinkedList<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
		LinkedList<Integer> listResult = new LinkedList<Integer>();
		String valueList1 = "";
		String valueList2 = "";

		for (Integer i = l1.size() - 1; i >= 0; i--) {
			valueList1 += l1.get(i) < 0 || l1.get(i) > 9 ? 0 : l1.get(i);
		}
		for (Integer i = l2.size() - 1; i >= 0; i--) {
			valueList2 += l2.get(i) < 0 || l2.get(i) > 9 ? 0 : l2.get(i);
		}

		Integer result = Integer.valueOf(valueList1) + Integer.valueOf(valueList2);

		for (Integer i = 0; i < result.toString().length(); i++) {
			listResult.add(Integer.valueOf(Character.getNumericValue(result.toString().charAt(i))));
		}

		return listResult;
	}

	public static void main(String[] args) {
		List<Integer> oneList = new LinkedList<Integer>();
		List<Integer> anotherList = new LinkedList<Integer>();

//		oneList.add(9); oneList.add(9); oneList.add(9); oneList.add(9); oneList.add(9); oneList.add(9); oneList.add(9); 
//		anotherList.add(9); anotherList.add(9); anotherList.add(9); anotherList.add(9);
		// output: 89990001

		oneList.add(2);
		oneList.add(4);
		oneList.add(3);
		anotherList.add(5);
		anotherList.add(6);
		anotherList.add(4);

		LinkedList<Integer> listResult = addTwoNumbers(oneList, anotherList);
		Iterator<Integer> iterator = listResult.descendingIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}

	}

}
