import java.util.Scanner;
/**
 * 
 * @author Connor Sibley
 * Mad Libs
 *
 */
public class MadLibs 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter an adjective:  ");
		String adjective = keyboard.nextLine();
		System.out.print("Enter a month:  ");
		String month = keyboard.nextLine();
		System.out.print("Enter a sound:  ");
		String sound = keyboard.nextLine();
		System.out.print("Enter a room:  ");
		String room = keyboard.nextLine();
		System.out.print("Enter a past tense verb:  ");
		String verb1 = keyboard.nextLine();
		System.out.print("Enter an animal:  ");
		String animal = keyboard.nextLine();
		System.out.print("Enter a verb ending in -ing:  ");
		String verbing = keyboard.nextLine();
		System.out.print("Enter a noun:  ");
		String noun = keyboard.nextLine();
		System.out.print("Enter a color:  ");
		String color = keyboard.nextLine();
		System.out.print("Enter a past tense verb:  ");
		String verb2 = keyboard.nextLine();
		System.out.println(' ');
		
		System.out.println("It was a "+adjective+' '+month+" morning, and I had just woken up");
		System.out.println("to a loud "+sound+" coming from the "+room+".");
		System.out.println("I "+verb1+" down the stairs and into the "+room+" to see a "+ animal);
		System.out.println(verbing + " on the table. When it noticed me it ran and hid under the");
		System.out.println(noun+". I looked where it was hiding, only to see a pair of "+color+" eyes staring back at me.");
		System.out.println("I yelped in surprise as the "+animal+" darted out from under the "+noun);
		System.out.println("and "+verb2+" through the window. I looked out to see where it went, but the");
		System.out.println(animal+" had vanished.");
		

	}

}
