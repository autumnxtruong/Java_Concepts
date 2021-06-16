package variables;

public class problems {
	//Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. 
	//Assign the sum to a variable. Print out the result.
	public void number1() {
		int var1 = 1;
		int var2 = 1;
		int sum = var1 + var2;
		
		 System.out.println(sum);	
	}
	
	
	//Write a program that declares 2 double variables, assigns a number to each, and adds them together. 
	//Assign the sum to a variable. Print out the result.
	
	public void number2() {
		double var1 = 1.0;
		double var2 = 1.0;
		double sum = var1 + var2;
		
		 System.out.println(sum);	
	}
	
	
	//Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
	//Assign the sum to a variable. Print out the result. What variable type must the sum be?
	
	public void number3() {
		int var1 = 1;
		double var2 = 1.0;
		double sum = var1 + var2; //sum would have to be double
		
		 System.out.println(sum);	
	}
	
	//Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
	//Assign the result to a variable. Print out the result. Now change the larger number to a decimal. 
	//What happens? What corrections are needed?
	
	public void number4() {
		int var1 = 2;
		int var2 = 4;
		int rslt = var2 / var1; 	
		System.out.println("Dividing two ints: " + rslt);	
		var2 = (int) 4.5;
		rslt = var2/var1;
		System.out.println("Dividing int and decimal: " + rslt);	
		
	}
	
	//	Write a program where you create 3 variables that represent products at a cafe. 
	//	The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. 
	//	Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 
	//	4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal. 
	//	Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
	//	Be sure to format the results to 2 decimal places.
	public void number5() {
		double apple = 2;
		double bread = 3;
		double steak = 10;
		
		double subtotal;
		double totalSale;
		final double SALES_TAX = .08;
		subtotal = (3* apple) + (4 * bread) + (2 * steak);
		totalSale = subtotal + (subtotal * SALES_TAX);
		System.out.println(totalSale);
		
	}
	
	
	//Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
	//Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
	
	//Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q 
	//and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
	
	//Write a program that declares a named constant and uses it in a calculation. Print the result.


}
