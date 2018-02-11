//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
	public static void main(String[] args) {
		int happinessLevel = 0;
		// 1. Ask the user what kind of pet they want to buy, and store in variable
int a = JOptionPane.showOptionDialog(null, "What pet do you want?", "", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Dog", "Cat", "Hamster" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 10; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "give food", "pet" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (a==0&&task==2) {
	dogcuddle();
	happinessLevel++;
}
if (a==0&&task==1) {
	doggivefood();
	happinessLevel++;
}
if (a==0&&task==0) {
	dogpet();
	happinessLevel++;
}
if (a==1&&task==2) {
	catcuddle();
	happinessLevel++;
}
if (a==1&&task==1) {
	catgivefood();
	happinessLevel++;
}
if (a==1&&task==0) {
	catpet();
	happinessLevel++;
}
if (a==2&&task==2) {
	hamstercuddle();
	happinessLevel++;
}
if (a==2&&task==1) {
	hamstergivefood();
	happinessLevel++;
}
if (a==2&&task==0) {
	hamsterpet();
	happinessLevel++;
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel==5) {
	JOptionPane.showMessageDialog(null, "You love your pet a lot!");
	break;
}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void dogcuddle() {
		JOptionPane.showMessageDialog(null, "Your dog purrs");
	}
	public static void catcuddle() {
		JOptionPane.showMessageDialog(null, "Your cat purrs");
	}
	public static void hamstercuddle() {
		JOptionPane.showMessageDialog(null, "Your hamster purrs");
	}
	public static void doggivefood() {
		JOptionPane.showMessageDialog(null, "Your dog is happy");
	}
	public static void catgivefood() {
		JOptionPane.showMessageDialog(null, "Your cat is happy");
	}
	public static void hamstergivefood() {
		JOptionPane.showMessageDialog(null, "Your hamster is happy");
	}
	public static void dogpet() {
		JOptionPane.showMessageDialog(null, "Your dog licks your hand");
	}
	public static void catpet() {
		JOptionPane.showMessageDialog(null, "Your cat licks your hand");
	}
	public static void hamsterpet() {
		JOptionPane.showMessageDialog(null, "Your hamster licks your hand");
	}
}