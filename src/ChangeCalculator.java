//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String x = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int b = Integer.parseInt(x);
		// Ask the user how many dimes they have, and convert their answer
String y = JOptionPane.showInputDialog("How many dimes do you have?");
int c = Integer.parseInt(y);
		// Ask the user how many quarters they have, and convert their answer
String z = JOptionPane.showInputDialog("How many quarters do you have?");
int d = Integer.parseInt(z);
		// Calculate how much money the user has and save it in a double variable 
double a = (.05 * b + .10 * c + .25 * d);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $" + a);
	}
}

