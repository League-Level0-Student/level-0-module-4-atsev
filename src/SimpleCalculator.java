

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < 1000000000; i++) {
String a = JOptionPane.showInputDialog("Pick a number:");
String b = JOptionPane.showInputDialog("Pick another number:");
int x = Integer.parseInt(a);
int y = Integer.parseInt(b);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Choose an operation", "", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==0) {
	Add(x,y);
}
if (operation==1) {
	Subtract(x,y);
}
if (operation==2) {
	Multiply(x,y);
}
if (operation==3) {
	Divide(x,y);
}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
static void Add(int x, int y) {
	JOptionPane.showMessageDialog(null, x + "+" + y + "=" + (x+y));
}
static void Subtract(int x, int y) {
	JOptionPane.showMessageDialog(null, x + "-" + y + "=" + (x-y));
}
static void Multiply(int x, int y) {
	JOptionPane.showMessageDialog(null, x + "*" + y + "=" + (x*y));
}
static void Divide(int x, int y) {
	JOptionPane.showMessageDialog(null, x + "/" + y + "=" + (x/y));
}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}