package com.advance;

import java.util.Scanner;

public class Rectangle {
    int length; 
    int breadth; 
    int area; 
    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	int perimeter;

	void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
       int  breadth = sc.nextInt();
    }
   
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

