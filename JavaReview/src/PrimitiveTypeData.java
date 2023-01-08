import javax.swing.text.StyleConstants.CharacterConstants;

public class PrimitiveTypeData{
	
	public static void main(String args[]) {

		constants();
	}
	
	
	/**
	 * Method where the primitive date types are specified
	 */
	public void primitiveDataTypes() {
		//Integers
		byte myByte = 125; //range 128 
		short numericShort = 31850;//range -32000 a 32000
		int entero = 2100111; //range 2'174.000.000 //4 bytes 
		Long integerLong = 111222333444L; //8 byte.
		
		//Decimals
		float flotante = 45.8F; //4 bytes
		double numericDouble = 45.123456789101112;  //8 byes
		
		//character y boolean
		char myCharacter = 'g';
		boolean myBoolean = false;
	}
	
	/**
	 * Method where the constants are defined.
	 */
	public static void constants(){
		
		final int integerConstant = 3;
		utils.imp(integerConstant);
	}
	
	


	
}