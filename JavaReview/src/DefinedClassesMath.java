
public class DefinedClassesMath {
	
	public static void main(String arg[]){
		typeConversion();
	}
	
	/**
	 * Basic operations are being used in this method.
	 */
	private static void basicOperators() {
		double sum = 4 + 5 - 1;
		double multiplication = 4*8*2;
		double division = multiplication/sum;
		
		int module = 15%6;
		
		utils.imp("La división es: "+division);
		utils.imp("El resto es : "+module);
		
		module++;
		module--;
		
	}
	
	/**
	 * Comparison Operators and conditional-if are used in this method.
	 */
	private static void comparisonOperators(){
		int height = 4;
		int base = 6;
		
		// >= <= == != 
		
		if(height != base) {
			utils.imp("The high is different than base ");
		}else if(height > base){
			utils.imp("The heigh is bigger than base ");
		}else {
			utils.imp("the height is less than the base ");
		}
	}
	
	/**
	 *  Functions of the class Math are used in this method. 
	 */
	private static void functionsMath() {
		
		//Constants
		double pi = Math.PI;
	    double euler = Math.E;
	    
	    //Functions 
		double root = Math.sqrt(50404.5);
		double exponent = Math.pow(euler, root);
		double round = Math.round(2.4);
		
		utils.imp("The result of operations is: " + exponent);	
		utils.imp("The round is: " + round);
		
		//Functions Trigonometric
		double sen = Math.sin(round);
		double cos= Math.cos(round);
		double tan = Math.tan(round);
		double atan = Math.atan(round);
		
		utils.imp("The arctangent of variable round is: "+ atan);
	}
	
	
	private static void typeConversion() {
		//the funcition Math.round return long type
		//can make a conversion whit el type of data inside parenthesis
		int round = (int)Math.round(4.48);
		utils.imp(round);
	}
	
	
	
}
