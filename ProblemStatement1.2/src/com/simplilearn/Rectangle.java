package com.simplilearn;

public class Rectangle {
	private int length;
	private int breadth;


	/**
	 * (a) default constructor
	 */
	public Rectangle() {
	}


	/**
	 * constructor to pass on length and breadth of a Rectangle
	 * 
	 * @param length
	 * @param breadth
	 */
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	/**
	 * Add a method printData( ) to print the two information about the rectangle in
	 * console.
	 */
	public void printData() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}


	/**
	 * method printArea()
	 */
	public void printArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}


}


