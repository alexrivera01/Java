import java.util.Scanner;

/**
 * @author Alexander Rivera
 * This class is specified tools methods for input and output of data 
 */
public class utils {
	
	/**
	 * Methods to print data console.
	 * @param pCadena parametro que recibe la cadena a imprimir
	 */
	public static void imp(String pCadena) {
		System.out.println(pCadena);
	}
	public static void imp(char pChar) {
		System.out.println(pChar);
	}	
	public static void imp(int pEntero) {
		System.out.println(pEntero);
	}
	
	/**
	 * This method print a message to user 
	 * after ask to the next line (entered for user)
	 * @param pMessageToUser Message to print
	 * @return The line wrote for user.
	 */
	public static String scanner(String pMessageToUser) {
		imp(pMessageToUser);
		Scanner read = new Scanner(System.in);
		String stringToReturn = read.nextLine();
		return stringToReturn;
	}
}
