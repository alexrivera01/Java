import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefinedClassesString {
	
	public static void main(String arg[]) {
		returnAStringOfTheLine();
	}
	
	/**
	 * Some function of class predefined String
	 */
	public static void ClassString() {
		String stringAux = "My string";
		
		int countChar = stringAux.length();
		char myCharacter = stringAux.charAt(3);
		String mySubString = stringAux.substring(3);
		
		//if return 0 is equal a the other string.
		int sonIguales =  mySubString.compareTo("String"); 
		
		utils.imp(mySubString);
		
	}
	
	/**
	 * Exercise 1. console 
	 * Ask for two string 
	 * The program will return if the strings are equals and return the strings lengths   
	 */
	
	public static void twoStringAreEqueals(){
		
		Scanner read = new Scanner(System.in);
		String firstString, secondString;
		
		utils.imp("Please, you write your first string: ");
		firstString = read.nextLine();
		
		utils.imp("Please, you write your second string: ");
		secondString = read.nextLine();
		
		boolean areEquals = firstString.equals(secondString);
		
		if(areEquals) {
			utils.imp("The string entered are equals");
		}else {
			utils.imp("The string entered are not equals");
		}
		
		utils.imp("The lenght of the first string: \""+firstString+"\" are: "+ firstString.length());
		utils.imp("The lenght of the second string: \""+secondString+"\" are: "+ secondString.length());
	}
	
	/**
	 * Exercise 2. console.
	 * a.Ask to for a line of text
	 * b.Ask for a number for that the program can return a string
	 * c. Whit the number entered the program must return a string correspondent
	 * Example: Entered: "in the night is dark" , 3
	 * 		    Program Return : "night"
	 */
	
	public static void returnAStringOfTheLine(){
		Scanner read = new Scanner(System.in);
		String myString, auxIndex;
		String arrString[];
		int index = 0;
		
		utils.imp("Enter the String:");
		myString = read.nextLine();
		utils.imp("Enter the number de the word to return:");
		auxIndex = read.nextLine();
		
		Pattern pat = Pattern.compile("[0-9]*"); 
		Matcher mat = pat.matcher(auxIndex);
		
		boolean isValid = mat.matches();
		
		if(isValid) {
			index = Integer.parseInt(auxIndex)-1;
		}else{
			utils.imp("The number entered is not valid, must be numbers");
			return;
		}
		
		arrString = myString.split(" ");
				
		/*
		for (String string : arrString) {
			utils.imp(string);
		}*/
		
		utils.imp("The word is: " + arrString[index]);
		
		
		utils.imp("Finished");
		
	}
	
}

