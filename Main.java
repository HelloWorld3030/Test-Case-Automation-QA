package com.company;

public class Main {

    public static void main(String[] args) {
		Figure [] array = new Figure[] {new Circle(), new Square(), new Triangle(), new Trapezoid()};


		int n = (int) (Math.random() * 10);

		Figure [] array2 = new Figure [n];
		for (int i = 0; i < array2.length; i++)
		{
			int m = (int) (Math.random() * 4);
			array2[i] = array[m];
		}


		for(int i = 0; i < array2.length; i++)
	    array2[i].type();

    }
}
